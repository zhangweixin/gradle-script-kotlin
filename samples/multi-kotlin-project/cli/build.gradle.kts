buildscript {
    repositories {
        gradleScriptKotlin()
    }
    dependencies {
        classpath(kotlinModule("gradle-plugin"))
    }
}

plugins {
    application
}

apply {
    plugin("kotlin")
}

application {
    mainClassName = "cli.Main"
}

dependencies {
    compile(project(":core"))
    compile(kotlinModule("stdlib"))
}
