# Android-Gradle-Plugin [![](https://jitpack.io/v/jxiaow/android-gradle-plugin.svg)](https://jitpack.io/#jxiaow/android-gradle-plugin)

一款实现了360加固的Gradle插件，在自动编译打包后进行360加固流程操作。

### 使用步骤

#### 1. 添加依赖

* 在根`build.gradle`中添加：

```groovy
buildscript {
    // ...
    repositories {
				// ...
        maven { url "https://jitpack.io" }
    }
    dependencies {
        classpath "com.android.tools.build:gradle:$gradle_version"
        classpath 'com.github.jxiaow:android-gradle-plugin:$version'
    }
}

allprojects {
    repositories {
       //...
       maven { url "https://jitpack.io" }
    }
}
```

<font color='red' >**tips:** 请替换 `$version`为最新的版本号:[![](https://jitpack.io/v/jxiaow/android-gradle-plugin.svg)](https://jitpack.io/#jxiaow/android-gradle-plugin),  `$gradle_version`的版本号必须`>= 4.0.1` </font>

* 在`app`的模块`build.gradle`中添加：

```groovy
apply plugin: 'com.github.jxiaow.jiagu'
```

#### 2. 参数配置

使用这款插件需要在`app`的`build.gradle`中添加一些配置信息，如下：

```groovy
android {
  
  // 配置apk签名
  signingConfigs {
        release {
            storeFile file('签名文件路径')
            storePassword '文件存储密码'
            keyAlias '签名文件简称'
            keyPassword '签名文件密码'
        }
    }

  	// 加固参数配置
    jiagu {
        home '../360jiagu' // 360加固软件的根目录
        buildTypes 'release', 'debug' // 需要加固的编译类型
        configs '-crashlog' // 选择360的可选配置服务
        username 'user' // 360加固用户名
        password 'password' // 360加固密码
        charsetName 'GBK' // 360加固控制台输出字符编码
        // apk签名文件， 如果在Android中配置了签名文件，此项可以不用配置，插件会自动读取名为'release'的签名文件
        signingConfig signingConfigs.release
    }
}
```

#### 3. 开始加固

确认上述参数无误后，我们可以在AS的Gradle窗口app/task看到我们所配置的加固`JiaGuApk`。

或者在控制台中切换到当前项目根目录执行

```shell
# 各个系统的控制台gradle命令可能不一样： ./gradlew 或 gradlew 
# 一次性打包加固所有渠道的apk
./gradlew clean jiaGuApk 
# 打包并加固某一个渠道的apk
# 命令 ./gradlew jiaGuApk[渠道名][BuildType类型]
# 如：
./gradlew jiaGuApkXiaomiRelease
```

### 文档

[android-gradle-plugin](https://jxiaow.github.io/android-gradle-plugin/plugin/com.github.jxiaow.jiagu/index.html)

### 360加固助手

[360加固助手](https://jiagu.360.cn/#/global/download)

