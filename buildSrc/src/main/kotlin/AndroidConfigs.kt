object AndroidConfigs {

    const val COMPILE_SDK   = 32

    object DefaultConfig {
        const val MIN_SDK       = 21
        const val TARGET_SDK    = 32
        const val VERSION_CODE  = 1
        const val VERSION_NAME  = "1.0"

        const val APPLICATION_ID_APP = "com.andhiratobing.moviecompose"
    }
    object BuildTypes {
        const val BUILD_TYPE_RELEASE = "release"
    }
    object KotlinOptions {
        const val JVM_TARGET = "1.8"
    }

    const val TEST_INSTRUMENTATION_RUNNER   = "androidx.test.runner.AndroidJUnitRunner"
    const val CONSUMER_PROGUARD_FILES       = "consumer-rules.pro"
    const val GET_DEFAULT_PROGUARD_FILE     = "proguard-android-optimize.txt"
    const val PROGUARD_RULES                = "proguard-rules.pro"
}