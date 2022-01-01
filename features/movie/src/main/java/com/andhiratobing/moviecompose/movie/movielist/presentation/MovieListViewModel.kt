package com.andhiratobing.moviecompose.movie.movielist.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andhiratobing.moviecompose.movie.movielist.domain.models.MovieDomain
import com.andhiratobing.moviecompose.movie.movielist.domain.usecase.MovieUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel @Inject constructor(
    private val useCase: MovieUseCase
) : ViewModel() {

    private var _movieList: MutableLiveData<List<MovieDomain>> = MutableLiveData()
    val movieList: LiveData<List<MovieDomain>> get() = _movieList

    init {
        _movieList.value = getMovieList()
    }

    private fun getMovieList(): List<MovieDomain> {
        return useCase.invoke()
    }
}