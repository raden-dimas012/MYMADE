package com.dimas.made1.core.data.source.remote.response.movie

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("results")
    val results: List<Movie>
)
