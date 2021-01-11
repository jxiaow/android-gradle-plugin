---
title: JiaGuCmds -
---
//[plugin](../../index.md)/[com.github.jxiaow.jiagu](../index.md)/[JiaGuCmds](index.md)



# JiaGuCmds  
 [jvm] 加固命令类，此类中包含了相关的加固命令，这些命令来源于360加固文档  
  
class [JiaGuCmds](index.md)(**extension**: [JiaGuExtension](../-jia-gu-extension/index.md))   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [<init>](-init-.md)|  [jvm] fun [<init>](-init-.md)(extension: [JiaGuExtension](../-jia-gu-extension/index.md))   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [executeCmd](execute-cmd.md)| [jvm]  <br>Brief description  <br>利用控制台执行命令  <br>Content  <br>fun [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html).[executeCmd](execute-cmd.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [jiagu](jiagu.md)| [jvm]  <br>Brief description  <br>执行加固 [apkFile]() 需要加固的原始文件, [output]([output]) 加固后文件的输出目录  <br>Content  <br>fun [jiagu](jiagu.md)(apkFile: [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html), jiaGuApk: [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [bashCmd](index.md#com.github.jxiaow.jiagu/JiaGuCmds/bashCmd/#/PointingToDeclaration/)|  [jvm] 加固执行的bash命令val [bashCmd](index.md#com.github.jxiaow.jiagu/JiaGuCmds/bashCmd/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| [configCmd](index.md#com.github.jxiaow.jiagu/JiaGuCmds/configCmd/#/PointingToDeclaration/)|  [jvm] 配置可选配置val [configCmd](index.md#com.github.jxiaow.jiagu/JiaGuCmds/configCmd/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?   <br>
| [importSignCmd](index.md#com.github.jxiaow.jiagu/JiaGuCmds/importSignCmd/#/PointingToDeclaration/)|  [jvm] 导入签名信息命令val [importSignCmd](index.md#com.github.jxiaow.jiagu/JiaGuCmds/importSignCmd/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| [loginCmd](index.md#com.github.jxiaow.jiagu/JiaGuCmds/loginCmd/#/PointingToDeclaration/)|  [jvm] 执行登陆命令val [loginCmd](index.md#com.github.jxiaow.jiagu/JiaGuCmds/loginCmd/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| [showConfigCmd](index.md#com.github.jxiaow.jiagu/JiaGuCmds/showConfigCmd/#/PointingToDeclaration/)|  [jvm] 显示配置信息val [showConfigCmd](index.md#com.github.jxiaow.jiagu/JiaGuCmds/showConfigCmd/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| [showSignCmd](index.md#com.github.jxiaow.jiagu/JiaGuCmds/showSignCmd/#/PointingToDeclaration/)|  [jvm] 展示签名信息命令val [showSignCmd](index.md#com.github.jxiaow.jiagu/JiaGuCmds/showSignCmd/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| [showVersionCmd](index.md#com.github.jxiaow.jiagu/JiaGuCmds/showVersionCmd/#/PointingToDeclaration/)|  [jvm] 显示配置的版本val [showVersionCmd](index.md#com.github.jxiaow.jiagu/JiaGuCmds/showVersionCmd/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>

