allprojects {
    group = "io.github.sof3.j2mlog"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

buildscript {
    repositories {
        mavenCentral()
    }
}

plugins {
    kotlin("jvm") version "1.4.10"
}
