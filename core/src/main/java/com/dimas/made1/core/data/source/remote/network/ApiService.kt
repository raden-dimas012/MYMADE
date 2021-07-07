package com.dimas.made1.core.data.source.remote.network

import com.dimas.made1.core.data.source.remote.response.movie.MovieResponse
import com.dimas.made1.core.data.source.remote.response.tv.TvResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("movie/popular")
    suspend fun getMovies(@Query("api_key") apiKey: String): MovieResponse

    @GET("tv/popular")
    suspend fun getTv(@Query("api_key") apiKey: String?): TvResponse

}