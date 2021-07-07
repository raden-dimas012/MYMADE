package com.dimas.made1.core.data.source.remote


import com.dimas.made1.core.BuildConfig
import com.dimas.made1.core.data.source.remote.network.ApiResponse
import com.dimas.made1.core.data.source.remote.network.ApiService
import com.dimas.made1.core.data.source.remote.response.movie.Movie
import com.dimas.made1.core.data.source.remote.response.tv.Tv
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn


class RemoteDataSource (private val apiService : ApiService) {
    private val apiKey = BuildConfig.API_KEY

    suspend fun getMovies(): Flow<ApiResponse<List<Movie>>> {
        return flow {
            try {
                val response = apiService.getMovies(apiKey)
                val movieList = response.results
                if (movieList.isNotEmpty()) {
                    emit(ApiResponse.Success(response.results))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getTv(): Flow<ApiResponse<List<Tv>>> {
        return flow {
            try {
                val response = apiService.getTv(apiKey)
                val tvShowList = response.results
                if (tvShowList.isNotEmpty()) {
                    emit(ApiResponse.Success(response.results))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
            }
        }.flowOn(Dispatchers.IO)
    }
}