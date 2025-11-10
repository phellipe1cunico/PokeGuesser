//
// ARQUIVO: settings.gradle.kts
//
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

// Vamos usar "pokeapp" para bater com seu código, e não "pokegssr"
rootProject.name = "pokeapp"
include(":app")