---
title: com.github.jxiaow.jiagu -
---
//[plugin](../index.md)/[com.github.jxiaow.jiagu](index.md)



# Package com.github.jxiaow.jiagu  


## Types  
  
|  Name|  Summary| 
|---|---|
| [JiaGuCmds](-jia-gu-cmds/index.md)| [jvm]  <br>Brief description  <br>加固命令类，此类中包含了相关的加固命令，这些命令来源于360加固文档  <br>Content  <br>class [JiaGuCmds](-jia-gu-cmds/index.md)(**extension**: [JiaGuExtension](-jia-gu-extension/index.md))  <br><br><br>
| [JiaGuExtension](-jia-gu-extension/index.md)| [jvm]  <br>Brief description  <br>在Gradle中配置的"jiagu"参数实例映射  <br>Content  <br>open class [JiaGuExtension](-jia-gu-extension/index.md)(**home**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?,**username**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?,**password**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?,**signingConfig**: [SigningConfig]()?,**charsetName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>
| [JiaGuPlugin](-jia-gu-plugin/index.md)| [jvm]  <br>Brief description  <br>360加固插件，该插件必须要运行在[Android]([Android])项目中  <br>Content  <br>class [JiaGuPlugin](-jia-gu-plugin/index.md) : [Plugin]()  <br><br><br>
| [JiaGuTask](-jia-gu-task/index.md)| [jvm]  <br>Brief description  <br>360加固任务，此任务在"assembleXXX"后运行  <br>Content  <br>open class [JiaGuTask](-jia-gu-task/index.md) : [DefaultTask]()  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [calculateMD5](calculate-m-d5.md)| [jvm]  <br>Brief description  <br>计算文件的md5,出错的话返回null  <br>Content  <br>fun [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html).[calculateMD5](calculate-m-d5.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?  <br><br><br>
| [execute](execute.md)| [jvm]  <br>Brief description  <br>在控制台执行命令  <br>Content  <br>fun [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html).[execute](execute.md)(): [Process](https://docs.oracle.com/javase/8/docs/api/java/lang/Process.html)  <br><br><br>
| [existsOrCreate](exists-or-create.md)| [jvm]  <br>Brief description  <br>检测该文件是否存在，如果存在则会执行[block]()方法，如果不存在则创建该文件  <br>Content  <br>fun [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html).[existsOrCreate](exists-or-create.md)(block: () -> [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)  <br><br><br>
| [forNameCharsetOrNull](for-name-charset-or-null.md)| [jvm]  <br>Brief description  <br>获取编码字符，如果指定的编码有误，则返回null  <br>Content  <br>fun [forNameCharsetOrNull](for-name-charset-or-null.md)(charset: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Charset](https://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)?  <br><br><br>
| [log](log.md)| [jvm]  <br>Brief description  <br>输出加固日志  <br>Content  <br>fun [log](log.md)(msg: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>
| [text](text.md)| [jvm]  <br>Brief description  <br>获取控制台文字信息  <br>Content  <br>fun [Process](https://docs.oracle.com/javase/8/docs/api/java/lang/Process.html).[text](text.md)(charset: [Charset](https://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [tryCaching](try-caching.md)| [jvm]  <br>Brief description  <br>忽略异常  <br>Content  <br>inline fun <[R](try-caching.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?> [tryCaching](try-caching.md)(block: () -> [R](try-caching.md)): [R](try-caching.md)?  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [sign](index.md#com.github.jxiaow.jiagu//sign/com.android.builder.model.SigningConfig?#/PointingToDeclaration/)|  [jvm] 获取加固所需要的签名信息val [SigningConfig]()?.[sign](index.md#com.github.jxiaow.jiagu//sign/com.android.builder.model.SigningConfig?#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>

