plugins {
    alias(libs.plugins.agpApp)
    alias(libs.plugins.kapt)
    alias(libs.plugins.ksp)
    id("kotlin-android")
    id("kotlin-parcelize")
    id("realm-android")
//    alias(libs.plugins.playStorePublisher)
    alias(libs.plugins.bugsnag)
    alias(libs.plugins.compose)
    alias(libs.plugins.vgo)
    alias(libs.plugins.metro)
}

metro {
    interop {
        includeDagger()
    }
}

android {
    namespace = "org.example.repro"

    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "org.example.repro"
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1"
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    implementation(platform(libs.androidxComposeBom))
    implementation(libs.androidxComposeUi)
}
