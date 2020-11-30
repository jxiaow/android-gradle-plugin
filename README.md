# Android-Gradle-Plugin [![](https://jitpack.io/v/jxiaow/android-gradle-plugin.svg)](https://jitpack.io/#jxiaow/android-gradle-plugin)

一款实现了360加固的Gradle插件，在自动编译打包后进行360加固流程操作。

### 使用步骤

#### 1. 添加依赖

* 在根`build.gradle`中添加：

```groovy
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}

dependencies {
    ...
    classpath 'com.android.tools.build:gradle:4.0.1'
    classpath 'com.github.jxiaow:android-gradle-plugin:$version'
}
```

(请替换 `$version`为最新的版本号:[![](https://jitpack.io/v/jxiaow/android-gradle-plugin.svg)](https://jitpack.io/#jxiaow/android-gradle-plugin))

**tips:** `com.android.tools.build:gradle`的版本号必须>= 4.0.1

* 在`app`的模块`build.gradle`中添加：

```groovy
apply plugin: 'com.github.jxiaow.jiagu'
```

#### 2. 参数配置

使用这款插件需要在`app`的`build.gradle`中添加一些配置信息，如下：

```groovy
jiagu {
    home '../360jiagu' // 360加固软件的根目录
    buildTypes 'release', 'debug' // 需要加固的编译类型
    configs '-crashlog' // 选择360的可选配置服务
    username 'user' // 360加固用户名
    password 'password' // 360加固密码
    charsetName 'GBK' // 360加固控制台输出字符编码
    // apk签名文件， 如果在Android中配置了签名文件，此项可以不用配置，插件会自动读取名为'release'的签名文件
    signingConfig { 
        key_alias         : KEY_ALIAS, 
        key_password      : KEY_PASSWORD,
        key_store_password: KEY_STORE_PASSWORD,
        key_store_file    : KEY_STORE_FILE
    }
}
```

#### 3. 开始加固

确认上述参数无误后，就可以在控制台中切换到当前项目根目录执行

```shell
# 各个系统的控制台gradle命令可能不一样： ./gradlew 或 gradlew 
./gradlew clean jiaGuApk 
```

### 文档

[android-gradle-plugin](https://jxiaow.github.io/android-gradle-plugin/plugin/com.github.ixiaow.jiagu/index.html)

### 360加固助手

[360加固助手](https://jiagu.360.cn/#/global/download)

