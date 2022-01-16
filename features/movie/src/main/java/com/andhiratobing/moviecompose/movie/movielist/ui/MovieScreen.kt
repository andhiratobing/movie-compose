package com.andhiratobing.moviecompose.movie.movielist.ui

import androidx.compose.foundation.ExperimentalFoundationApi
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
import com.andhiratobing.moviecompose.movie.movielist.ui.components.MovieListScreen
import com.andhiratobing.moviecompose.movie.movielist.ui.viewmodel.MovieListViewModel

@ExperimentalCoilApi
@Composable
fun MovieScreen() {
    val viewModel: MovieListViewModel = hiltViewModel()
    val state by viewModel.movieList.observeAsState(emptyList())
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

            items(state) { movie ->
                MovieListScreen(
                    title = movie.title ?: "",
                    posterPath = movie.posterPath ?: "",
                    genre = movie.genreIds ?: listOf("")
                )
            }
        }
    }
}


@ExperimentalFoundationApi
@ExperimentalCoilApi
@Preview(showBackground = true)
@Composable
fun MovieScreenPreview() {
    MovieScreen()
}