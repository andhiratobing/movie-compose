// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Plugins.GradlePluginClasspath.TOOLS_BUILD_GRADLE)
        classpath(Plugins.GradlePluginClasspath.KOTLIN_GRADLE_PLUGIN)
        classpath(Plugins.GradlePluginClasspath.HILT_GRADLE_PLUGIN)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}