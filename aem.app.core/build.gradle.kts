plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.cognifide.aem.bundle")
}

description = "Example - AEM Application Core"

dependencies {
    implementation(project(":aem.app.common"))
}
