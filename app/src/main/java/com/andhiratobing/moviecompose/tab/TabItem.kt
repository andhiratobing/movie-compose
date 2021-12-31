package com.andhiratobing.moviecompose.tab

import androidx.compose.runtime.Composable
import com.andhiratobing.movie.MovieScreen
import com.andhiratobing.tvshows.TvShowsScreen


sealed class TabItem(
    var title: String,
    var screen: @Composable () -> Unit
) {
    object Movie : TabItem(title = "Movie", screen = { MovieScreen() })
    object TvShows : TabItem(title = "TvShows", screen = { TvShowsScreen() })
}