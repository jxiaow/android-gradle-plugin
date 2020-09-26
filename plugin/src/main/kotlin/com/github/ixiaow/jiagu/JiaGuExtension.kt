package com.github.ixiaow.jiagu

import com.android.builder.model.SigningConfig

/**
 * 在Gradle中配置的"jiagu"参数实例映射
 */
open class JiaGuExtension(
    var home: String? = null, // 360加固可执行程序的根目录是根目录
    var buildTypes: Array<String> = arrayOf(), // 需要加固的编译类型，如 release debug
    var config: Array<String> = arrayOf(), // 加固的可选配置
    var username: String? = null, // 360加固的用户名
    var password: String? = null, // 360加固的登录密码
    var signingConfig: SigningConfig? = null, // apk的签名文件，默认自动获取android配置下的签名文件
    var charsetName: String = "UTF-8" // 控制台输出编码方式，360加固在某些终端上输出信息会有乱码存在
)

/**
 * 获取加固所需要的签名信息
 */
val SigningConfig?.sign: String
    get() {
        this ?: return ""
        return "$storeFile $storePassword $keyAlias $keyPassword"
    }

/**
 * 组成编译命令，如 assembleRelease
 */
val JiaGuExtension.buildTypeAssemblePaths: Array<String>
    @Suppress("DefaultLocale")
    get() = buildTypes.map { "assemble${it.capitalize()}" }.toTypedArray()

/**
 * 获取加固的可选配置
 */
val JiaGuExtension.jiaGuConfig: String?
    get() {
        var result: String? = null
        config.forEach { content -> result = result?.let { " $content" } ?: content }
        return result
    }