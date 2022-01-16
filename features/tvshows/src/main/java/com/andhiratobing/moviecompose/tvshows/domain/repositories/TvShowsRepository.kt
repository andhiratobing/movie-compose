package com.andhiratobing.moviecompose.tvshows.domain.repositories

import com.andhiratobing.moviecompose.tvshows.domain.models.TvShowsDomain

interface TvShowsRepository {

    fun getTvShowsList(): List<TvShowsDomain>
}