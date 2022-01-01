package com.andhiratobing.moviecompose.movie.movielist.domain.usecase

import com.andhiratobing.moviecompose.movie.movielist.domain.models.MovieDomain
import com.andhiratobing.moviecompose.movie.movielist.domain.repositories.MovieRepository
import javax.inject.Inject

class MovieUseCaseImpl @Inject constructor(
    private val movieRepository: MovieRepository
) : MovieUseCase {

    override fun invoke(): List<MovieDomain> {
        return movieRepository.getMovieList()
    }
}