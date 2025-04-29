plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("maven-publish")
}
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
    }
}

dependencies {
    constraints {
        api("com.github.cdcountrydelight:CD-Function-Helper:1.0.0")
        api("com.github.cdcountrydelight:CD-Logger:1.0.16")
        api("com.github.cdcountrydelight:CDNamingConventions:1.1.2")
        api("com.github.cdcountrydelight:CDPreferencesHelper:1.0.6")
        api("com.github.cdcountrydelight:commonutils:1.0.0")
    }
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                groupId = "com.github.cdcountrydelight"
                artifactId = "BOM"
                version = "1.0.0"
                from(components["java"])
            }
        }
    }
}

