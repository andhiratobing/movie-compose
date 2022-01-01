package com.andhiratobing.moviecompose.movie.movielist.domain.repositories

import com.andhiratobing.moviecompose.movie.movielist.domain.models.MovieDomain

interface MovieRepository {

    fun getMovieList(): List<MovieDomain>
}