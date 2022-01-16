plugins {
    id(Plugins.GradlePluginId.ANDROID_LIBRARY)
    id(Plugins.GradlePluginId.KOTLIN_ANDROID)
}

android {
    compileSdk  = AndroidConfigs.COMPILE_SDK

    defaultConfig {
        minSdk = AndroidConfigs.DefaultConfig.MIN_SDK
        targetSdk = AndroidConfigs.DefaultConfig.TARGET_SDK

        testInstrumentationRunner = AndroidConfigs.TEST_INSTRUMENTATION_RUNNER
        consumerProguardFiles(AndroidConfigs.CONSUMER_PROGUARD_FILES)
    }

    buildTypes {
        getByName(AndroidConfigs.BuildTypes.BUILD_TYPE_RELEASE) {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(AndroidConfigs.GET_DEFAULT_PROGUARD_FILE),
                AndroidConfigs.PROGUARD_RULES
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = AndroidConfigs.KotlinOptions.JVM_TARGET
    }
}

dependencies {

    /** Unit test **/
    testJUnit()

    /** Instrumentation test **/
    androidTestEspresso()
    composeUiTest()
}