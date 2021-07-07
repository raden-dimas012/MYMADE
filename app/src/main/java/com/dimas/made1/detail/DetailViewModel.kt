package com.dimas.made1.detail

import androidx.lifecycle.ViewModel
import com.dimas.made1.core.domain.model.DataDomain
import com.dimas.made1.core.domain.usecase.DataUseCase

class DetailViewModel(private val dataUseCase: DataUseCase) : ViewModel() {

    fun setFavoriteMovie(movie: DataDomain, newStatus: Boolean) {
        dataUseCase.setMovieFavorite(movie, newStatus)
    }

    fun setFavoriteTv(tv: DataDomain, newStatus: Boolean) {
        dataUseCase.setTvFavorite(tv, newStatus)
    }
}