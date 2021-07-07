package com.dimas.made1.core.data.repository


import com.dimas.made1.core.data.source.local.LocalDataSource
import com.dimas.made1.core.data.source.remote.RemoteDataSource
import com.dimas.made1.core.data.source.remote.network.ApiResponse
import com.dimas.made1.core.data.source.remote.response.movie.Movie
import com.dimas.made1.core.data.source.remote.response.tv.Tv
import com.dimas.made1.core.domain.model.DataDomain
import com.dimas.made1.core.domain.repository.IDataRepository
import com.dimas.made1.core.utils.AppExecutors
import com.dimas.made1.core.utils.DataMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class DataRepository(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
) : IDataRepository {

    override fun getAllMovies(sort: String): Flow<Resource<List<DataDomain>>> =
        object :
            NetworkBoundResource<List<DataDomain>, List<Movie>>() {
            override fun loadFromDB(): Flow<List<DataDomain>> {
                return localDataSource.getMovies(sort).map {
                    DataMapper.mapEntitiesToDomainMovie(it)
                }
            }

            override fun shouldFetch(data: List<DataDomain>?): Boolean {
                return data == null || data.isEmpty()
            }

            override suspend fun createCall(): Flow<ApiResponse<List<Movie>>> {
                return remoteDataSource.getMovies()
            }

            override suspend fun saveCallResult(data: List<Movie>) {
                val movieList = DataMapper.mapResponseToEntityMovie(data)
                localDataSource.insertMovies(movieList)
            }
        }.asFlow()

    override fun getAllTv(sort: String): Flow<Resource<List<DataDomain>>> =
        object :
            NetworkBoundResource<List<DataDomain>, List<Tv>>() {
            override fun loadFromDB(): Flow<List<DataDomain>> {
                return localDataSource.getTv(sort).map {
                    DataMapper.mapEntitiesToDomainTv(it)
                }
            }

            override fun shouldFetch(data: List<DataDomain>?): Boolean {
                return data == null || data.isEmpty()
            }

            override suspend fun createCall(): Flow<ApiResponse<List<Tv>>> {
                return remoteDataSource.getTv()
            }

            override suspend fun saveCallResult(data: List<Tv>) {
                val tvList = DataMapper.mapResponseToEntityTv(data)
                localDataSource.insertTv(tvList)
            }
        }.asFlow()

    override fun getFavoriteMovies(): Flow<List<DataDomain>> {
        return localDataSource.getFavoriteMovies().map {
            DataMapper.mapEntitiesToDomainMovie(it)
        }
    }

    override fun getFavoriteTv(): Flow<List<DataDomain>> {
        return localDataSource.getFavoriteTv().map {
            DataMapper.mapEntitiesToDomainTv(it)
        }
    }

    override fun getSearchMovies(search: String): Flow<List<DataDomain>> {
        return localDataSource.getMovieSearch(search).map {
            DataMapper.mapEntitiesToDomainMovie(it)
        }
    }

    override fun getSearchTv(search: String): Flow<List<DataDomain>> {
        return localDataSource.getTvSearch(search).map {
            DataMapper.mapEntitiesToDomainTv(it)
        }
    }

    override fun setMovieFavorite(movie: DataDomain, state: Boolean) {
        val movieEntity = DataMapper.mapDomainToEntityMovie(movie)
        appExecutors.diskIO().execute {
            localDataSource.setFavoriteMovie(movieEntity, state)
        }
    }

    override fun setTvFavorite(tv: DataDomain, state: Boolean) {
        val tvEntity = DataMapper.mapDomainToEntityTv(tv)
        appExecutors.diskIO().execute {
            localDataSource.setFavoriteTv(tvEntity, state)
        }
    }


}