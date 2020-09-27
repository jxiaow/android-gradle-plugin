package com.github.ixiaow.jiagu

import com.android.build.gradle.AppExtension
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.tasks.TaskAction
import java.io.File

/**
 * 360加固任务，此任务在"assembleXXX"后运行
 */
open class JiaGuTask : DefaultTask() {
    // 加固命令实例
    private lateinit var cmds: JiaGuCmds
    private val jiaGuExtension: JiaGuExtension
    private val android: AppExtension

    // app版本号，此处的版本号去掉了中间的间隔".",如：2.16.1--> 2161
    private lateinit var appVersion: String

    // 缓存hex文件中的md5信息，用于比对是否已经存在加固文件
    private val hexMaps = mutableMapOf<String, String>()

    init {
        group = "android" // 将其归属于android组
        description = "task: 在将Apk打包完成后，进行360加固操作!" // 添加任务描述
        android = project.extensions.getByType(AppExtension::class.java)
        jiaGuExtension = project.extensions.getByType(JiaGuExtension::class.java)
    }

    /**
     *  执行Apk文件加固流程
     */
    @TaskAction
    fun action() {
        log("开始执行加固任务")
        appVersion = android.defaultConfig.versionName.replace(".", "")
        cmds = JiaGuCmds(jiaGuExtension)
        // 遍历得到符合编译类型的 applicationVariants
        val variants = android.applicationVariants.filter {
            jiaGuExtension.isJiaGuBuildType(it.buildType.name)
        }
        if (variants.isEmpty()) {
            project.logger.warn("配置的加固类型，与编译类型不匹配!")
            return
        }
        // 遍历符合编译类型的applicationVariants,获取apk路径
        variants.forEach { variant ->
            // 判断当前是否是最后一个Apk生成任务
            variant.packageApplicationProvider.configure { packageApp ->
                // 获取apk的输出目录
                val parent = packageApp.outputDirectory.get().asFile.absolutePath
                executeTask(parent)
            }
        }
    }

    /**
     * 对[directory]目录下的apk进行加固
     * */
    private fun executeTask(directory: String) {
        val dir = File(directory)
        if (!dir.exists()) {
            log("${directory}不存在，跳过对该目录下的文件进行加固操作!")
            return
        }
        log("正在对目录${directory}下的Apk文件进行加固")
        // 先读取hex值
        val hexFile = File(directory, "hex")
        hexFile.existsOrCreate { readHexInfo(hexMaps, hexFile) }
        // 筛选出apk文件进行加固
        dir.listFiles { file ->
            !file.isDirectory && file.name.endsWith(".apk")
        }?.forEach { apkFile ->
            log("开始对${apkFile.name}进行加固")
            // 只对apk进行加固
            if (!execute(apkFile, hexFile)) { //每个apk如果加固失败，会重试一次
                if (!execute(apkFile, hexFile)) {
                    throw GradleException("$apkFile 加固失败!")
                }
            }
        }
    }

    /**
     * 读取hex文件
     */
    private fun readHexInfo(hexMaps: MutableMap<String, String>, hexFile: File) {
        val hexMap = hexFile.readLines().asSequence().mapNotNull {
            val info = it.split(":")
            if (info.size == 2) {
                info[0] to info[1]
            } else {
                null
            }
        }.toMap()
        hexMaps.putAll(hexMap)
    }

    /**
     * 文件进行加固处理[apk] 需要加固的apk, [hexFile] 该buildType目录下对应的hex文件
     */
    private fun execute(apk: File, hexFile: File): Boolean {
        // 需要加固的apk的上一级目录
        val parentFile = apk.parentFile
        // apk加固后的输出目录
        val output =
            File("${parentFile.parent}${File.separator}jiagu${File.separator}${parentFile.name}")
        // 创建输出目录
        var mkdir = true
        if (!output.exists()) {
            mkdir = output.mkdirs()
        }
        if (!mkdir) {
            throw GradleException("创建目录失败!--> ${output.absolutePath}")
        }
        // 加固后apk名称，根据360加固后生成的文件拼接而来
        val prefix = apk.name.substringBefore(".apk")
        val jiaGuName = "${prefix}_${appVersion}_jiagu_sign.apk"
        val jiaGuApk = File(output, jiaGuName)
        project.logger.info("加固后的路径为：${jiaGuApk.absoluteFile}")
        // 计算md5比对，如果一致则不再进行加固
        val newMd5: String? = apk.calculateMD5()
        // 获取文件中的md5
        val oldMd5 = hexMaps[apk.name]
        // 加固文件存在并且原始文件md5一致，则不再重新加固
        if (jiaGuApk.exists() && newMd5 == oldMd5) {
            log("检测到 ${jiaGuApk.absoluteFile} 已经存在，所以不再进行加固处理!")
            return true
        }
        // 开始加固处理
        val ret = cmds.jiagu(apk, output.absolutePath)
        // 加固成功后，回写文件
        if (ret) {
            tryCaching {
                newMd5?.let {
                    hexFile.writer().use { writer ->
                        writer.append("${apk.name}:${it}")
                    }
                }
            }
        }
        return ret
    }

    /**
     * "jiagu"参数校验
     */
    fun validateJiaGuParams() {
        // 如果 "jiagu" 配置中未设置签名文件，那么直接获取release的签名文件信息
        jiaGuExtension.signingConfig = jiaGuExtension.signingConfig
            ?: android.signingConfigs.findByName("release")
        jiaGuExtension.validateJiaGuParams()
    }
}
