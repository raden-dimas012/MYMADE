package com.dimas.made1.core.domain.usecase

import com.dimas.made1.core.data.repository.Resource
import com.dimas.made1.core.domain.model.DataDomain
import com.dimas.made1.core.domain.repository.IDataRepository
import kotlinx.coroutines.flow.Flow

class DataInteractor(private val iDataRepository : IDataRepository) : DataUseCase {

    override fun getAllMovies(sort: String): Flow<Resource<List<DataDomain>>> =
        iDataRepository.getAllMovies(sort)

    override fun getAllTv(sort: String): Flow<Resource<List<DataDomain>>> =
        iDataRepository.getAllTv(sort)

    override fun getFavoriteMovies(): Flow<List<DataDomain>> =
        iDataRepository.getFavoriteMovies()

    override fun getFavoriteTv(): Flow<List<DataDomain>> =
        iDataRepository.getFavoriteTv()

    override fun getSearchMovies(search: String): Flow<List<DataDomain>> =
        iDataRepository.getSearchMovies(search)

    override fun getSearchTv(search: String): Flow<List<DataDomain>> =
        iDataRepository.getSearchTv(search)

    override fun setMovieFavorite(movie: DataDomain, state: Boolean) =
        iDataRepository.setMovieFavorite(movie,state)

    override fun setTvFavorite(tv: DataDomain, state: Boolean) =
        iDataRepository.setTvFavorite(tv,state)

}