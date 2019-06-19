plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.10")

    application

    idea
}

apply{
    from("gradle/checkstyle/check-style.gradle.kts")
}

repositories {
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
