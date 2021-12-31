/**
 * Configuration plugins in build gradle
 */
object Plugins {

    object GradlePluginClasspath {
        const val TOOLS_BUILD_GRADLE = "com.android.tools.build:gradle:${Versions.pluginBuildGradle}"
        const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.pluginKotlinGradle}"
    }

    object GradlePluginId {
        const val ANDROID_APPLICATION = "com.android.application"
        const val KOTLIN_ANDROID = "kotlin-android"
        const val ANDROID_LIBRARY = "com.android.library"
    }
}