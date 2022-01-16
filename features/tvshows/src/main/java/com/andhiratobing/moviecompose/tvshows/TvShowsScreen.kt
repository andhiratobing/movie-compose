package com.andhiratobing.moviecompose.tvshows

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import coil.annotation.ExperimentalCoilApi
import com.andhiratobing.moviecompose.tvshows.ui.components.TvShowsListScreen
import com.andhiratobing.moviecompose.tvshows.ui.viewmodel.TvShowsViewModel


@ExperimentalCoilApi
@Composable
fun TvShowsScreen() {
    val viewModel: TvShowsViewModel = hiltViewModel()
    val state by viewModel.tvShowsList.observeAsState(emptyList())
    val scrollState = rememberLazyListState()

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {

        LazyColumn(
            state = scrollState,
            reverseLayout = false,
            modifier = Modifier.fillMaxSize()
        ) {

            items(state) { tvShows ->
                TvShowsListScreen(
                    title = tvShows.title ?: "",
                    posterPath = tvShows.posterPath ?: "",
                    genre = tvShows.genreIds ?: listOf("")
                )
            }
        }
    }
}

@ExperimentalCoilApi
@Preview(showBackground = true)
@Composable
fun TvShowsScreenPreview() {
    TvShowsScreen()
}