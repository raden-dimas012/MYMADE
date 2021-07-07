package com.dimas.made1.favorite.content

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dimas.made1.core.domain.model.DataDomain
import com.dimas.made1.core.domain.usecase.DataUseCase

class FavoriteMovieTvViewModel(private val dataUseCase: DataUseCase) : ViewModel() {

    fun getFavoriteMovies(): LiveData<List<DataDomain>> =
        dataUseCase.getFavoriteMovies().asLiveData()

    fun getFavoriteTv(): LiveData<List<DataDomain>> =
        dataUseCase.getFavoriteTv().asLiveData()

    fun setFavoriteMovie(Movie: DataDomain, newState: Boolean) {
        dataUseCase.setMovieFavorite(Movie, newState)
    }
    fun setFavoriteTv(Tv: DataDomain, newState: Boolean) {
        dataUseCase.setTvFavorite(Tv, newState)
    }
}