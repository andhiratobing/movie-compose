package com.andhiratobing.moviecompose.tvshows.data.repositories

import com.andhiratobing.moviecompose.tvshows.data.datasource.DataSource
import com.andhiratobing.moviecompose.tvshows.data.models.TvShowsList
import com.andhiratobing.moviecompose.tvshows.data.models.asDomains
import com.andhiratobing.moviecompose.tvshows.domain.models.TvShowsDomain
import com.andhiratobing.moviecompose.tvshows.domain.repositories.TvShowsRepository
import com.google.gson.Gson
import javax.inject.Inject

class TvShowsRepositoryImpl @Inject constructor(
    private val dataSource: DataSource,
) : TvShowsRepository {

    override fun getTvShowsList(): List<TvShowsDomain> {
        val data = dataSource.getTvShowsList()
        return Gson().fromJson(data, TvShowsList::class.java).results.asDomains()
    }
}