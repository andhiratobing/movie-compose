package com.andhiratobing.moviecompose.tvshows.di

import com.andhiratobing.moviecompose.tvshows.data.datasource.DataSource
import com.andhiratobing.moviecompose.tvshows.data.datasource.DataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    @Singleton
    abstract fun bindsDataSource(
        dataSourceImpl: DataSourceImpl,
    ): DataSource
}