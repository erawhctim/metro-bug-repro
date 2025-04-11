import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.JavaVersion.VERSION_21
import org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

buildscript { dependencies { classpath(libs.pluginRealm) } }

plugins {
    alias(libs.plugins.agpApp) apply false
    alias(libs.plugins.agpLibrary) apply false
    alias(libs.plugins.bugsnag) apply false
    alias(libs.plugins.kotlin) apply false
    alias(libs.plugins.compose) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.kapt) apply false
    alias(libs.plugins.metro)
    alias(libs.plugins.vgo) apply false
    alias(libs.plugins.spotless)
    alias(libs.plugins.kotlinAndroid) apply false
}

subprojects {
    pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
        configure<KotlinJvmProjectExtension> { compilerOptions.jvmTarget.set(JVM_21) }
    }

    pluginManager.withPlugin("org.jetbrains.kotlin.android") {
        configure<KotlinAndroidProjectExtension> { compilerOptions.jvmTarget.set(JVM_21) }
    }

    pluginManager.withPlugin("java") {
        configure<JavaPluginExtension> {
            sourceCompatibility = VERSION_21
            targetCompatibility = VERSION_21
        }
    }

    pluginManager.withPlugin("com.android.application") {
        configure<ApplicationExtension> {
            compileOptions {
                sourceCompatibility = VERSION_21
                targetCompatibility = VERSION_21
            }
        }
    }
}