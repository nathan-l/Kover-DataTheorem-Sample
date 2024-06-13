

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            url=uri("https://mobile-protect-repos.securetheorem.com/mobileprotect-android")
            credentials {
                username = "MAVEN"
                password = "922ca7557bc5bd0011ff53054696d503fb2528fd28938931038082ce4a12d247"
            }
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
            credentials {
                username = "MAVEN"
                password = "922ca7557bc5bd0011ff53054696d503fb2528fd28938931038082ce4a12d247"
            }
        }
    }
}

rootProject.name = "android_kts"
include(":app", ":lib")
