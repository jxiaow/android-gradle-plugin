package com.github.ixiaow.jiagu

import com.android.builder.model.SigningConfig

/**
 * 在Gradle中配置的"jiagu"参数实例映射
 */
open class JiaGuExtension(
    /**
     * 360加固可执行程序的根目录是根目录
     */
    var home: String? = null,
    /**
     * 360加固的用户名
     */
    var username: String? = null,
    /**
     * 360加固的登录密码
     */
    var password: String? = null,
    /**
     *  apk的签名文件，默认自动获取android配置下的签名文件
     */
    var signingConfig: SigningConfig? = null,
    /**
     * 控制台输出编码方式，360加固在某些终端上输出信息会有乱码存在
     */
    var charsetName: String = "UTF-8"
) {
    /**
     * 需要加固的编译类型，如 release debug
     */
    private val buildTypes: HashSet<String> = hashSetOf()

    /**
     * 加固的可选配置
     */
    private val configs: HashSet<String> = hashSetOf()


    /**
     * 需要加固的编译类型，如 release debug
     */
    open fun buildTypes(vararg buildTypes: String): JiaGuExtension {
        val filter = buildTypes.asSequence().filterNot { it.isEmpty() || it.isBlank() }
        this.buildTypes.addAll(filter)
        return this
    }

    /**
     * 获取加固的编译类型
     */
    fun getBuildTypes(): Set<String> = buildTypes

    /**
     * 添加加固的配置选项
     */
    open fun configs(vararg configs: String): JiaGuExtension {
        this.configs.addAll(configs)
        return this
    }

    /**
     * 判断当前的编译类型[buildType]是否需要加固
     */
    fun isJiaGuBuildType(buildType: String) = this.buildTypes.contains(buildType)

    /**
     * 组成编译命令，如 assembleRelease
     */
    val buildTypeAssemblePaths: Array<String>
        @Suppress("DefaultLocale")
        get() = buildTypes.map { "assemble${it.capitalize()}" }.toTypedArray()

    /**
     * 获取加固的可选配置
     */
    val jiaGuConfig: String?
        get() {
            var result: String? = null
            configs.forEach { content -> result = result?.let { " $content" } ?: content }
            return result
        }

    /**
     * 进行加固参数校验
     */
    fun validateJiaGuParams() {
        // 参数校验
        requireNotNull(home) { "360加固程序根目录不能为空!" }
        requireNotNull(username) { "360加固用户名不能为空!" }
        requireNotNull(password) { "360加固密码不能为空!" }
        requireNotNull(signingConfig) { "无法找到Apk的签名文件不存在，请先配置release签名文件!" }
    }
}

/**
 * 获取加固所需要的签名信息
 */
val SigningConfig?.sign: String
    get() {
        this ?: return ""
        return "$storeFile $storePassword $keyAlias $keyPassword"
    }
