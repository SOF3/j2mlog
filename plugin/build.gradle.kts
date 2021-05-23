plugins {
    kotlin("jvm")
    `java-gradle-plugin`
    `maven-publish`
}

gradlePlugin {
    plugins {
        create("j2mlog-plugin") {
            id = "io.github.sof3.j2mlog.plugin"
            implementationClass = "io.github.sof3.j2mlog.plugin.Main"
        }
    }
}

dependencies {
}
