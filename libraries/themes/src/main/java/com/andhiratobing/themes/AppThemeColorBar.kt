package com.andhiratobing.themes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun AppThemeColorBar() {
    val stateUiController = rememberSystemUiController()
    val darkTheme = isSystemInDarkTheme()

    stateUiController.setStatusBarColor(
        color = if (darkTheme) MaterialTheme.colors.onBackground
        else MaterialTheme.colors.onBackground
    )
    stateUiController.setSystemBarsColor(
        color = if (darkTheme) MaterialTheme.colors.onBackground
        else MaterialTheme.colors.onBackground
    )
    stateUiController.setNavigationBarColor(
        color = if (darkTheme) MaterialTheme.colors.onBackground
        else MaterialTheme.colors.onBackground
    )
}