package com.andhiratobing.moviecompose.movie.movielist.di

import com.andhiratobing.moviecompose.movie.movielist.domain.usecase.MovieUseCase
import com.andhiratobing.moviecompose.movie.movielist.domain.usecase.MovieUseCaseImpl
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
    abstract fun bindsMovieUseCase(
        movieUseCaseImpl: MovieUseCaseImpl
    ): MovieUseCase
}