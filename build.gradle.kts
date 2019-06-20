buildscript {
    repositories {
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath("gradle.plugin.com.github.spotbugs:spotbugs-gradle-plugin:2.0.0")
    }
}

plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.10")

    application

    idea
}

apply {
    from("gradle/checkstyle/check-style.gradle.kts")
    from("gradle/spotbugs.gradle.kts")
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    testImplementation("org.jetbrains.kotlin:kotlin-test")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClassName = "cn.gaoyuexiang.commerce.order.AppKt"
}
