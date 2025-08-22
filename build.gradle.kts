import com.android.build.api.dsl.ApplicationExtension
import dev.zacsweers.metro.gradle.MetroPluginExtension
import org.gradle.api.JavaVersion.VERSION_21
import org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21
import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

plugins {
    alias(libs.plugins.agpApp) apply false
    alias(libs.plugins.agpLibrary) apply false
    alias(libs.plugins.kotlin) apply false
    alias(libs.plugins.compose) apply false
    alias(libs.plugins.metro)
    alias(libs.plugins.kotlinAndroid) apply false
}

subprojects {
    pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
        configure<KotlinJvmProjectExtension> { compilerOptions.jvmTarget.set(JVM_21) }
    }

    pluginManager.withPlugin("org.jetbrains.kotlin.android") {
        configure<KotlinAndroidProjectExtension> { compilerOptions.jvmTarget.set(JVM_21) }
    }

    pluginManager.withPlugin("dev.zacsweers.metro") {
        configure<MetroPluginExtension> {
            interop {
                includeDagger()
            }
        }
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