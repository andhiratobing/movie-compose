package com.andhiratobing.moviecompose.tvshows.domain.usecase

import com.andhiratobing.moviecompose.tvshows.data.repositories.TvShowsRepositoryImpl
import com.andhiratobing.moviecompose.tvshows.domain.models.TvShowsDomain
import javax.inject.Inject

class TvShowsUseCaseImpl @Inject constructor(
    private val repository: TvShowsRepositoryImpl,
) : TvShowsUseCase {

    override fun invoke(): List<TvShowsDomain> {
        return repository.getTvShowsList()
    }
}