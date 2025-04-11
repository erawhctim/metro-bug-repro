pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)

    /**
     * These repositories are evaluated top-down when attempting to resolve dependencies. More
     * commonly-used repository URLs should live at the top, and less-commonly-used URLs should be
     * placed at the bottom.
     */
    repositories {
        mavenCentral()
        google()
        maven(url = "https://maven.google.com")
    }
}

plugins {

}

rootProject.name = "metro-kapt-bug-repro"
include("app")
