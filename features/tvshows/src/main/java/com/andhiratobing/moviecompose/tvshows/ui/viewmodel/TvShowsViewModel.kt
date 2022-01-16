package com.andhiratobing.moviecompose.tvshows.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andhiratobing.moviecompose.tvshows.domain.models.TvShowsDomain
import com.andhiratobing.moviecompose.tvshows.domain.usecase.TvShowsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TvShowsViewModel @Inject constructor(
    private val useCase: TvShowsUseCase
) : ViewModel() {

    private var _tvShowsList: MutableLiveData<List<TvShowsDomain>> = MutableLiveData()
    val tvShowsList: LiveData<List<TvShowsDomain>> get() = _tvShowsList

    init {
        _tvShowsList.value = getTvShowsList()
    }

    private fun getTvShowsList() : List<TvShowsDomain> {
        return useCase.invoke()
    }
}