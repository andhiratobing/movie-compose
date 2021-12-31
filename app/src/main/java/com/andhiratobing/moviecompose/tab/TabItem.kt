package com.andhiratobing.moviecompose.tab

import androidx.compose.runtime.Composable
import com.andhiratobing.moviecompose.movie.MovieScreen
import com.andhiratobing.moviecompose.tvshows.TvShowsScreen

sealed class TabItem(
    var title: String,
    var screen: @Composable () -> Unit
) {
    object Movie : TabItem(title = "Movie", screen = { MovieScreen() })
    object TvShows : TabItem(title = "TvShows", screen = { TvShowsScreen() })
}