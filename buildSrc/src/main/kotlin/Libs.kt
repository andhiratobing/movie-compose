/**
 * Library common resources
 */
object Libs {

    object Android {
        const val androidCoreKtx                    = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
        const val androidAppCompat                  = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
        const val androidMaterial                   = "com.google.android.material:material:${Versions.materialVersion}"
    }

    object Compose {
        const val composeCompiler                   = "androidx.compose.compiler:compiler:${Versions.composeCompilerVersion}"
        const val composeUi                         = "androidx.compose.ui:ui:${Versions.composeUiVersion}"
        const val composeMaterial                   = "androidx.compose.material:material:${Versions.composeMaterialVersion}"
        const val composeUiTooling                  = "androidx.compose.ui:ui-tooling:${Versions.composeUiToolingVersion}"
        const val composeUiToolingPreview           = "androidx.compose.ui:ui-tooling-preview:${Versions.composeUiToolingVersion}"
        const val composeFoundation                 = "androidx.compose.foundation:foundation:${Versions.composeFoundationVersion}}"
        const val composeRuntime                    = "androidx.compose.runtime:runtime:${Versions.composeRuntimeVersion}"
        const val composeActivity                   = "androidx.activity:activity-compose:${Versions.composeActivityVersion}"
        const val composeConstraintLayout           = "androidx.constraintlayout:constraintlayout-compose:${Versions.composeConstraintLayoutVersion}"
    }

    object Lifecycle {
        const val lifecycleRuntimeKtx               = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimeKtxVersion}"
        const val lifecycleViewModelKtx             = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModelKtxVersion}"
        const val lifecycleViewModelCompose         = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycleViewModelComposeVersion}"
    }

    object GoogleAccompanist {
        const val accompanistPager                  = "com.google.accompanist:accompanist-pager:${Versions.accompanistPagerVersion}"
        const val accompanistPagerIndicator         = "com.google.accompanist:accompanist-pager-indicators:${Versions.accompanistIndicatorsVersion}"
        const val accompanistSystemUiController     = "com.google.accompanist:accompanist-systemuicontroller:${Versions.accompanistSystemUiController}"
    }

    object Coil {
        const val coilCompose                       = "io.coil-kt:coil-compose:${Versions.coilComposeVersion}"
    }

    object DaggerHilt {
        const val hiltNavigationCompose             = "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationComposeVersion}"
        const val hiltAndroid                       = "com.google.dagger:hilt-android:${Versions.hiltAndroidVersion}"
        const val hiltDaggerCompiler                = "com.google.dagger:hilt-android-compiler:${Versions.hiltAndroidVersion}"
        const val hiltViewModel                     = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltViewModelVersion}"
    }

    object Coroutine {
        const val coroutineCore                     = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutineVersion}"
        const val coroutineAndroid                  = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutineVersion}"
    }
}