package com.github.ixiaow.jiagu

import com.android.build.gradle.AppExtension
import com.android.build.gradle.AppPlugin
import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 360加固插件，该插件必须要运行在[Android]项目中
 */
class JiaGuPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        // 该插件必须运行于Android项目中
        if (!target.plugins.hasPlugin(AppPlugin::class.java)) {
            throw GradleException("无法在非android application插件中使用360加固")
        }

        // 创建配置"jiagu"
        target.extensions.create("jiagu", JiaGuExtension::class.java)

        // 脚本读取完毕后，进行加固任务创建
        target.afterEvaluate { project ->
            // 获取加固配置
            val jiaGuExtension = project.extensions.getByType(JiaGuExtension::class.java)
            val android = project.extensions.getByType(AppExtension::class.java)
            // 在执行第一个preXXxBuild任务时 进行参数校验，可有效的解决，apk打包完成后，参数出现问题
            if (jiaGuExtension.getBuildTypes().isEmpty()) {
                project.logger.warn("未配置加固编译类型, 无法启用加固任务!")
                return@afterEvaluate
            }
            // 创建 jiaGuApk 任务
            createJiaGuApkTask(project, jiaGuExtension, android)
            // 创建 jiaGuApkAssemblexxXX, 如： jiaGuApk xmh Release
            jiaGuExtension.getBuildTypes().forEach { type ->
                if (android.productFlavors.isNullOrEmpty()) {
                    createSingleTask(project, type)
                } else {
                    android.productFlavors.forEach { flavor ->
                        createSingleTask(project, type, flavor.name)
                    }
                }
            }
        }
    }

    /**
     * 根据编译类型名[typeName]和[flavorName]渠道名创建一个task
     * 在"preflavorNameTypeNameBuild"中注册参数校验
     */
    @Suppress("DefaultLocale")
    fun createSingleTask(project: Project, typeName: String, flavorName: String? = null) {
        project.tasks.create(
            "jiaGuApk${flavorName?.capitalize() ?: ""}${typeName.capitalize()}",
            JiaGuTask::class.java
        ) { jiaGuTask ->
            // 添加了渠道包时，就需要将渠道名拼接上
            project.tasks.find {
                it.name.contains("pre${flavorName?.capitalize() ?: ""}${typeName.capitalize()}Build")
            }?.let { task ->
                task.doFirst {
                    log("在${it.name}任务中校验加固参数")
                    jiaGuTask.validateJiaGuParams()
                }
            }
        }.dependsOn("assemble${flavorName?.capitalize() ?: ""}${typeName.capitalize()}")
    }

    @Suppress("DefaultLocale")
    private fun createJiaGuApkTask(
        project: Project,
        jiaGuExtension: JiaGuExtension,
        android: AppExtension
    ) {
        project.tasks.create("jiaGuApk", JiaGuTask::class.java) { jiaGuTask ->
            val buildType = jiaGuExtension.getBuildTypes().first().capitalize()
            // 添加了渠道包时，就需要将渠道名拼接上
            val taskName = if (!android.productFlavors.isNullOrEmpty()) {
                val flavor = android.productFlavors.first().name.capitalize()
                "pre${flavor}${buildType}Build"
            } else {
                "pre${buildType}Build"
            }
            project.tasks.find { it.name.contains(taskName) }?.let { task ->
                task.doFirst {
                    log("在${it.name}任务中校验加固参数")
                    jiaGuTask.validateJiaGuParams()
                }
            }
        }
            // jiaGuApk的任务需要依赖assembleXXX, 其中XXX 表示 "jiaGu"配置中的buildType值
            .dependsOn(jiaGuExtension.buildTypeAssemblePaths)
    }
}