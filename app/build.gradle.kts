plugins {
    alias(libs.plugins.agpApp)
    alias(libs.plugins.compose)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.metro)
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
        compose = true
    }
}

dependencies {
    implementation(platform(libs.androidxComposeBom))
    implementation(libs.androidxComposeActivity)
    implementation(libs.androidxComposeUi)
    implementation(libs.androidxFragmentKtx)
    implementation(libs.rxjava)
    implementation(libs.dagger)
}
