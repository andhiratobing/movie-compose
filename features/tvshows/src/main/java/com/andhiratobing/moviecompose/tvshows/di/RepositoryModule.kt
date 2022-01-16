package com.andhiratobing.moviecompose.tvshows.di

import com.andhiratobing.moviecompose.tvshows.data.datasource.DataSource
import com.andhiratobing.moviecompose.tvshows.data.repositories.TvShowsRepositoryImpl
import com.andhiratobing.moviecompose.tvshows.domain.repositories.TvShowsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideTvShowsRepository(
        dataSource: DataSource,
    ): TvShowsRepository {
        return TvShowsRepositoryImpl(dataSource)
    }
}