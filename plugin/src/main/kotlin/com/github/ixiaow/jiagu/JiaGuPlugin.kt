package com.github.ixiaow.jiagu

import com.android.build.gradle.AppExtension
import com.android.build.gradle.AppPlugin
import org.gradle.api.GradleException
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * 360加固插件
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
            // 创建 jiaGuApk 任务
            project.tasks.create("jiaGuApk", JiaGuTask::class.java)
                // jiaGuApk的任务需要依赖assembleXXX, 其中XXX 表示 "jiaGu"配置中的buildType值
                .dependsOn(jiaGuExtension.buildTypeAssemblePaths)
        }
    }
}