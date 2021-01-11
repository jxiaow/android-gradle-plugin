---
title: JiaGuExtension -
---
//[plugin](../../index.md)/[com.github.jxiaow.jiagu](../index.md)/[JiaGuExtension](index.md)



# JiaGuExtension  
 [jvm] 在Gradle中配置的"jiagu"参数实例映射  
  
open class [JiaGuExtension](index.md)(**home**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?,**username**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?,**password**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?,**signingConfig**: [SigningConfig]()?,**charsetName**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [<init>](-init-.md)|  [jvm] fun [<init>](-init-.md)(home: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, username: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, password: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, signingConfig: [SigningConfig]()?, charsetName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [buildTypes](build-types.md)| [jvm]  <br>Brief description  <br>需要加固的编译类型，如 release debug  <br>Content  <br>open fun [buildTypes](build-types.md)(vararg buildTypes: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<Out [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>): [JiaGuExtension](index.md)  <br><br><br>
| [configs](configs.md)| [jvm]  <br>Brief description  <br>添加加固的配置选项  <br>Content  <br>open fun [configs](configs.md)(vararg configs: [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<Out [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>): [JiaGuExtension](index.md)  <br><br><br>
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [getBuildTypes](get-build-types.md)| [jvm]  <br>Brief description  <br>获取加固的编译类型  <br>Content  <br>fun [getBuildTypes](get-build-types.md)(): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [isJiaGuBuildType](is-jia-gu-build-type.md)| [jvm]  <br>Brief description  <br>判断当前的编译类型[buildType]()是否需要加固  <br>Content  <br>fun [isJiaGuBuildType](is-jia-gu-build-type.md)(buildType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [validateJiaGuParams](validate-jia-gu-params.md)| [jvm]  <br>Brief description  <br>进行加固参数校验  <br>Content  <br>fun [validateJiaGuParams](validate-jia-gu-params.md)()  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [buildTypeAssemblePaths](index.md#com.github.jxiaow.jiagu/JiaGuExtension/buildTypeAssemblePaths/#/PointingToDeclaration/)|  [jvm] 组成编译命令，如 assembleReleaseval [buildTypeAssemblePaths](index.md#com.github.jxiaow.jiagu/JiaGuExtension/buildTypeAssemblePaths/#/PointingToDeclaration/): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>   <br>
| [charsetName](index.md#com.github.jxiaow.jiagu/JiaGuExtension/charsetName/#/PointingToDeclaration/)|  [jvm] 控制台输出编码方式，360加固在某些终端上输出信息会有乱码存在var [charsetName](index.md#com.github.jxiaow.jiagu/JiaGuExtension/charsetName/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| [home](index.md#com.github.jxiaow.jiagu/JiaGuExtension/home/#/PointingToDeclaration/)|  [jvm] 360加固可执行程序的根目录是根目录var [home](index.md#com.github.jxiaow.jiagu/JiaGuExtension/home/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?   <br>
| [jiaGuConfig](index.md#com.github.jxiaow.jiagu/JiaGuExtension/jiaGuConfig/#/PointingToDeclaration/)|  [jvm] 获取加固的可选配置val [jiaGuConfig](index.md#com.github.jxiaow.jiagu/JiaGuExtension/jiaGuConfig/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?   <br>
| [password](index.md#com.github.jxiaow.jiagu/JiaGuExtension/password/#/PointingToDeclaration/)|  [jvm] 360加固的登录密码var [password](index.md#com.github.jxiaow.jiagu/JiaGuExtension/password/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?   <br>
| [signingConfig](index.md#com.github.jxiaow.jiagu/JiaGuExtension/signingConfig/#/PointingToDeclaration/)|  [jvm] apk的签名文件，默认自动获取android配置下的签名文件var [signingConfig](index.md#com.github.jxiaow.jiagu/JiaGuExtension/signingConfig/#/PointingToDeclaration/): [SigningConfig]()?   <br>
| [username](index.md#com.github.jxiaow.jiagu/JiaGuExtension/username/#/PointingToDeclaration/)|  [jvm] 360加固的用户名var [username](index.md#com.github.jxiaow.jiagu/JiaGuExtension/username/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?   <br>

