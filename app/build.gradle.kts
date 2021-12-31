plugins {
    id(Plugins.GradlePluginId.ANDROID_APPLICATION)
    id(Plugins.GradlePluginId.KOTLIN_ANDROID)
}

android {
    compileSdk  = AndroidConfigs.COMPILE_SDK

    defaultConfig {
        applicationId = AndroidConfigs.DefaultConfig.APPLICATION_ID_APP
        minSdk = AndroidConfigs.DefaultConfig.MIN_SDK
        targetSdk = AndroidConfigs.DefaultConfig.TARGET_SDK
        versionCode = AndroidConfigs.DefaultConfig.VERSION_CODE
        versionName = AndroidConfigs.DefaultConfig.VERSION_NAME

        testInstrumentationRunner = AndroidConfigs.TEST_INSTRUMENTATION_RUNNER
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompilerVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    /** Module**/
    implementation(project(Modules.themes))
    implementation(project(Modules.components))

    /** Android ui **/
    androidUi()

    /** Compose ui **/
    composeUi()

    /** view pager **/
    viewPager()

    /** System ui bar controller**/
    implementation(Libs.GoogleAccompanist.accompanistSystemUiController)

    /** Lifecycle runtime **/
    implementation(Libs.Lifecycle.lifecycleRuntimeKtx)

    /** Unit test **/
    testJUnit()

    /** Instrumentation test **/
    androidTestEspresso()
    composeUiTest()

    /** Debug compose **/
    debugComposeUiTooling()
}