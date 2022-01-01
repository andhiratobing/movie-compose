package com.andhiratobing.moviecompose.tab

import androidx.compose.runtime.Composable
import coil.annotation.ExperimentalCoilApi
import com.andhiratobing.moviecompose.movie.movielist.presentation.MovieScreen
import com.andhiratobing.moviecompose.tvshows.TvShowsScreen

sealed class TabItem(
    var title: String,
    var screen: @Composable () -> Unit
) {
    @ExperimentalCoilApi
    object Movie : TabItem(title = "Movie", screen = { MovieScreen() })
    object TvShows : TabItem(title = "TvShows", screen = { TvShowsScreen() })
}