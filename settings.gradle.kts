

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            url=uri("https://mobile-protect-repos.securetheorem.com/mobileprotect-android")
            // Credentials need to be provided
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            url=uri("https://mobile-protect-repos.securetheorem.com/mobileprotect-android")
            // Credentials need to be provided
        }
    }
}

rootProject.name = "android_kts"
include(":app", ":lib")
