package com.andhiratobing.moviecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.andhiratobing.moviecompose.tab.TabItem
import com.andhiratobing.moviecompose.tab.TabScreen
import com.andhiratobing.moviecompose.ui.theme.MovieComposeTheme
import com.andhiratobing.themes.AppThemeColorBar
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalPagerApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    AppThemeColorBar()
                    TabContentScreen()
                }
            }
        }
    }
}

@ExperimentalPagerApi
@Composable
fun TabContentScreen() {
    val pagerState = rememberPagerState()
    val pageScreen = listOf(TabItem.Movie, TabItem.TvShows)

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
        ) {
            TabScreen(
                pageScreen = pageScreen,
                pagerState = pagerState
            )
            com.andhiratobing.moviecompose.tab.TabContentScreen(
                pageScreen = pageScreen,
                pagerState = pagerState
            )
        }
    }
}