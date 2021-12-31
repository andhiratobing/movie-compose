import org.gradle.api.artifacts.dsl.DependencyHandler

/** Implementation **/
fun DependencyHandler.implementation(dependencyNotation: String) {
    add("implementation", dependencyNotation)
}

/** Kapt **/
fun DependencyHandler.kapt(dependencyNotation: String) {
    add("kapt", dependencyNotation)
}

/** Api **/
fun DependencyHandler.api(dependencyNotation: String) {
    add("api", dependencyNotation)
}

/** Test Implementation **/
fun DependencyHandler.testImplementation(dependencyNotation: String) {
    add("testImplementation", dependencyNotation)
}

/** Android Test Implementation **/
fun DependencyHandler.androidTestImplementation(dependencyNotation: String) {
    add("androidTestImplementation", dependencyNotation)
}
/** Debug Implementation **/
fun DependencyHandler.debugImplementation(dependencyNotation: String) {
    add("debugImplementation", dependencyNotation)
}


//---------------------IMPLEMENTATION AND COMPILER------------------------//

/** Android UI **/
fun DependencyHandler.androidUi(){
    implementation(Libs.Android.androidCoreKtx)
    implementation(Libs.Android.androidAppCompat)
    implementation(Libs.Android.androidMaterial)
}

/** Compose UI **/
fun DependencyHandler.composeUi() {
    implementation(Libs.Compose.composeCompiler)
    implementation(Libs.Compose.composeUi)
    implementation(Libs.Compose.composeMaterial)
    implementation(Libs.Compose.composeUiTooling)
    implementation(Libs.Compose.composeUiToolingPreview)
    implementation(Libs.Compose.composeActivity)
    implementation(Libs.Compose.composeConstraintLayout)
    implementation(Libs.Compose.composeFoundation)
    implementation(Libs.Compose.composeRuntime)
}

/** Pager or view pager **/
fun DependencyHandler.viewPager() {
    api(Libs.GoogleAccompanist.accompanistPager)
    api(Libs.GoogleAccompanist.accompanistPagerIndicator)
}

/** Lifecycle **/
fun DependencyHandler.lifecycle() {
    implementation(Libs.Lifecycle.lifecycleRuntimeKtx)
    implementation(Libs.Lifecycle.lifecycleViewModelKtx)
    implementation(Libs.Lifecycle.lifecycleViewModelCompose)
}

/** Dagger hilt **/
fun DependencyHandler.daggerHilt() {
    implementation(Libs.DaggerHilt.hiltAndroid)
    // annotation processing
    kapt(Libs.DaggerHilt.hiltDaggerCompiler)

}

/** Kotlin Coroutine **/
fun DependencyHandler.kotlinCoroutine() {
    implementation(Libs.Coroutine.coroutineCore)
    implementation(Libs.Coroutine.coroutineAndroid)
}


//---------------------TEST------------------------//

/** JUnit Test **/
fun DependencyHandler.testJUnit(){
    testImplementation(Tests.jUnit)
    androidTestImplementation(Tests.extJUnit)
}

/** Espresso Test **/
fun DependencyHandler.androidTestEspresso() {
    androidTestImplementation(Tests.espressoCore)
}

fun DependencyHandler.composeUiTest() {
    androidTestImplementation(Tests.composeUiTest)
}

//---------------------DEBUG------------------------//

/** Compose Ui Debug **/
fun DependencyHandler.debugComposeUiTooling() {
    debugImplementation(Debugs.composeUiTooling)
}