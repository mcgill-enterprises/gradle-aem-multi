repositories {
    mavenLocal()
    jcenter()
    maven { url = uri("https://plugins.gradle.org/m2") }
    maven { url = uri("http://dl.bintray.com/cognifide/maven-public") }
    maven { url = uri("https://dl.bintray.com/neva-dev/maven-public") }
}

dependencies {
    implementation("com.cognifide.gradle:aem-plugin:7.0.0-beta")
    implementation("com.neva.gradle:fork-plugin:3.1.1")
    implementation("com.moowork.gradle:gradle-node-plugin:1.2.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.30")
}
