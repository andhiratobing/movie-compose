/**
 * Library test resources
 */
object Tests {

    /** testImplementation **/
    const val jUnit                     = "junit:junit:${Versions.junitVersion}"

    /** androidTestImplementation **/
    const val extJUnit                  = "androidx.test.ext:junit:${Versions.extJunitVersion}"
    const val espressoCore              = "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"
    const val composeUiTest             = "androidx.compose.ui:ui-test-junit4:${Versions.composeUiTest}"
}