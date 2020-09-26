package com.github.ixiaow.jiagu

import java.io.File
import java.io.IOException
import java.nio.charset.Charset
import java.security.MessageDigest
import java.util.*
import javax.xml.bind.DatatypeConverter

/**
 * 在控制台执行命令
 */
@Throws(IOException::class)
fun String.execute() = Runtime.getRuntime().exec(this)

/**
 * 获取控制台文字信息
 */
fun Process.text(charset: Charset): String {
    return this.inputStream.reader(charset).readText()
}

/**
 * 输出加固日志
 */
fun log(msg: String?) {
    msg?.let { println("JiaGu -->  $it") }
}

/**
 * 获取编码字符，如果指定的编码有误，则返回null
 */
fun forNameCharsetOrNull(charset: String): Charset? {
    return try {
        Charset.forName(charset)
    } catch (e: Exception) {
        null
    }
}

/**
 * 计算文件的md5
 */
fun File.calculateMD5(): String {
    return try {
        inputStream().use { input ->
            val md5Digest = MessageDigest.getInstance("MD5")
            val buffer = ByteArray(8192)
            var lenght: Int
            while (input.read(buffer).also { lenght = it } > 0) {
                md5Digest.update(buffer, 0, lenght)
            }
            val digest = md5Digest.digest()
            return DatatypeConverter.printHexBinary(digest).toUpperCase(Locale.US)
        }
    } catch (e: Exception) {
        log(e.message)
        ""
    }
}

/**
 * 忽略异常
 */
fun <R> tryCaching(block: () -> R): R? {
    return try {
        block.invoke()
    } catch (e: Exception) {
        null
    }
}

/**
 * 检测该文件是否存在，如果存在则会执行[block]方法，如果不存在则创建该文件
 */
fun File.existsOrCreate(block: () -> Unit): File {
    if (exists()) {
        block.invoke()
    } else {
        parentFile.mkdirs()
        createNewFile()
    }
    return this
}