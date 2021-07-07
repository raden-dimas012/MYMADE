package com.dimas.made1.core.domain.usecase


import com.dimas.made1.core.data.repository.Resource
import com.dimas.made1.core.domain.model.DataDomain
import kotlinx.coroutines.flow.Flow

interface DataUseCase {

    fun getAllMovies(sort: String): Flow<Resource<List<DataDomain>>>
    fun getAllTv(sort: String): Flow<Resource<List<DataDomain>>>
    fun getFavoriteMovies(): Flow<List<DataDomain>>
    fun getFavoriteTv(): Flow<List<DataDomain>>
    fun getSearchMovies(search: String): Flow<List<DataDomain>>
    fun getSearchTv(search: String): Flow<List<DataDomain>>
    fun setMovieFavorite(movie: DataDomain, state: Boolean)
    fun setTvFavorite(tv: DataDomain, state: Boolean)

}