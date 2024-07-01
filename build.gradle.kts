plugins {
    id("com.android.application") version "8.4.0" apply false
    id("com.android.library") version "8.4.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.20" apply false
    id("org.jetbrains.kotlinx.kover") version "0.8.1" apply false
    id("com.dtplugin.mobileprotect") version "24.0.1"
}

MobileProtectPluginConfiguration {
    excludeForTasks = mutableListOf("koverHtmlReport")
}