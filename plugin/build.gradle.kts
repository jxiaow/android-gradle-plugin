plugins {
    kotlin("jvm")
    id("org.jetbrains.dokka") version "1.4.0-rc"
    id("com.github.dcendents.android-maven")
    `maven-publish`
}

@kotlin.Suppress("GradleDependency")
kotlin {
    dependencies {
        implementation(gradleApi())
        compileOnly("com.android.tools.build:gradle:4.0.1")
    }

}

repositories {
    mavenLocal()
    jcenter()
}

group = "com.github.ixiaow"
version = "1.0.0"

tasks {
    val sourcesJar by registering(Jar::class) {
        dependsOn(JavaPlugin.CLASSES_TASK_NAME)
        archiveClassifier.set("sources")
        from(sourceSets["main"].allSource)
    }

    val javadocJar by registering(Jar::class) {
        dependsOn("dokkaJavadoc")
        archiveClassifier.set("javadoc")
        from(javadoc)
    }

    artifacts {
        archives(sourcesJar)
        archives(javadocJar)
        archives(jar)
    }
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "android-gradle-plugin"
            from(components["java"])
            artifact(tasks["sourcesJar"])
            artifact(tasks["javadocJar"])

            versionMapping {
                usage("com.android.tools.build:gradle") {
                    fromResolutionOf("runtimeClasspath")
                }
            }
            pom {
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("ixiaow")
                        name.set("ixiaow")
                        email.set("i.xiaowujiang@gmail.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/ixiaow/android-gradle-plugin.git")
                    developerConnection.set("scm:git:ssh://githu.com/ixiaow/android-gradle-plugin.git")
                    url.set("https://github.com/ixiaow/android-gradle-plugin/")
                }
            }
        }
    }
    repositories {
        maven {
            // change URLs to point to your repos, e.g. http://my.org/repo
            val releasesRepoUrl = uri("$buildDir/repos/releases")
            val snapshotsRepoUrl = uri("$buildDir/repos/snapshots")
            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
        }
    }
}