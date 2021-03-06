plugins {
    id(Plugins.GradlePluginId.ANDROID_LIBRARY)
    id(Plugins.GradlePluginId.KOTLIN_ANDROID)
    id(Plugins.GradlePluginId.DAGGER_HILT)
    kotlin(Plugins.GradlePluginId.KOTLIN_KAPT)
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
    sourceSets {
        getByName("main") {
            assets {
                srcDirs("src/main/assets")
            }
        }
    }
}

dependencies {

    /** Module**/
    implementation(project(Modules.components))
    implementation(project(Modules.abstraction))

    /** Android ui **/
    androidUi()

    /** Compose ui **/
    composeUi()

    /** view pager **/
    viewPager()

    /** Dagger hilt**/
    daggerHilt()

    /** Coroutine **/
    kotlinCoroutine()

    /**Navigation compose **/
    navigationCompose()

    /**Hilt navigation compose**/
    implementation(Libs.DaggerHilt.hiltNavigationCompose)

    /**Live data **/
    implementation(Libs.Compose.composeRuntimeLiveData)

    /** GSON converter**/
    implementation(Libs.Gson.gson)

    /**Flow layout**/
    implementation(Libs.GoogleAccompanist.accompanistFlowLayout)

    /** Unit test **/
    testJUnit()

    /** Instrumentation test **/
    androidTestEspresso()
    composeUiTest()

    /** Debug compose **/
    debugComposeUiTooling()
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}