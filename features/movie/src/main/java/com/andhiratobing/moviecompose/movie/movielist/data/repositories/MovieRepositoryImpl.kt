package com.andhiratobing.moviecompose.movie.movielist.data.repositories

import com.andhiratobing.moviecompose.movie.movielist.data.datasource.DataSource
import com.andhiratobing.moviecompose.movie.movielist.data.models.MovieList
import com.andhiratobing.moviecompose.movie.movielist.data.models.asDomains
import com.andhiratobing.moviecompose.movie.movielist.domain.models.MovieDomain
import com.andhiratobing.moviecompose.movie.movielist.domain.repositories.MovieRepository
import com.google.gson.Gson
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val dataSource: DataSource
) : MovieRepository {

    override fun getMovieList(): List<MovieDomain> {
        val data = dataSource.getMovieList()
        return Gson().fromJson(data, MovieList::class.java).results.asDomains()
    }

}