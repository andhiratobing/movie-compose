package com.andhiratobing.moviecompose.tvshows.domain.usecase

import com.andhiratobing.moviecompose.tvshows.domain.models.TvShowsDomain

interface TvShowsUseCase {

    fun invoke(): List<TvShowsDomain>
}