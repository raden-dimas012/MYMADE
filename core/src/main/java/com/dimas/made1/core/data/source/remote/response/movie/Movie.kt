package com.dimas.made1.core.data.source.remote.response.movie

import com.google.gson.annotations.SerializedName

data class Movie(
    @field:SerializedName("id")
    var id: Int,

    @SerializedName("overview")
    var overview: String?=null,

    @SerializedName("poster_path")
    var posterPath: String?=null,

    @SerializedName("release_date")
    var releaseDate: String?=null,

    @SerializedName("title")
    var name: String,

    @SerializedName("vote_average")
    var voteAverage: Double?=null,

    @SerializedName("vote_count")
    var voteCount: Int?=null,

    @SerializedName("popularity")
    var popularity: Double?=null
)
