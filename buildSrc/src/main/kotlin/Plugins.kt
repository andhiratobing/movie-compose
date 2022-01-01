/**
 * Configuration plugins in build gradle
 */
object Plugins {

    object GradlePluginClasspath {
        const val TOOLS_BUILD_GRADLE = "com.android.tools.build:gradle:${Versions.pluginBuildGradle}"
        const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.pluginKotlinGradle}"
        const val HILT_GRADLE_PLUGIN = "com.google.dagger:hilt-android-gradle-plugin:${Versions.pluginHiltGradle}"
    }

    object GradlePluginId {
        const val ANDROID_APPLICATION = "com.android.application"
        const val KOTLIN_ANDROID = "kotlin-android"
        const val ANDROID_LIBRARY = "com.android.library"
        const val DAGGER_HILT = "dagger.hilt.android.plugin"
        const val KOTLIN_KAPT = "kapt"
        const val PARCELABLE = "kotlin-parcelize"
    }
}