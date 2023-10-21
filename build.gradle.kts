plugins {
    kotlin("jvm") version "1.9.10"
    application
}

group = "dev.kotler"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-runner-junit5:5.7.2")
    testImplementation("io.kotest:kotest-assertions-core-jvm:5.7.2")
    testImplementation("io.kotest:kotest-framework-engine-jvm:5.7.2")
    testImplementation("io.kotest:kotest-framework-datatest-jvm:5.7.2")
//    testImplФвementation("io.kotest.extensions:kotest-extensions-testcontainers:2.0.2")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}