package com.andhiratobing.moviecompose.movie.movielist.di

import com.andhiratobing.moviecompose.movie.movielist.data.datasource.DataSource
import com.andhiratobing.moviecompose.movie.movielist.data.repositories.MovieRepositoryImpl
import com.andhiratobing.moviecompose.movie.movielist.domain.repositories.MovieRepository
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
    fun provideMovieRepository(
        dataSource: DataSource
    ): MovieRepository {
        return MovieRepositoryImpl(dataSource)
    }
}