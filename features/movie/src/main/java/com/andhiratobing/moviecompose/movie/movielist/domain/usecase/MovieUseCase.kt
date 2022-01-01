package com.andhiratobing.moviecompose.movie.movielist.domain.usecase

import com.andhiratobing.moviecompose.movie.movielist.domain.models.MovieDomain

interface MovieUseCase {

    operator fun invoke(): List<MovieDomain>
}