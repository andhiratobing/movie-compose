package com.andhiratobing.moviecompose.tvshows.di

import com.andhiratobing.moviecompose.tvshows.domain.usecase.TvShowsUseCase
import com.andhiratobing.moviecompose.tvshows.domain.usecase.TvShowsUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class UseCaseModule {

    @Binds
    @ViewModelScoped
    abstract fun bindsTvShowsUseCase(
        tvShowsUseCaseImpl: TvShowsUseCaseImpl,
    ): TvShowsUseCase
}