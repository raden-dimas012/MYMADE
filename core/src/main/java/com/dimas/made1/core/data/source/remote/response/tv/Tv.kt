package com.dimas.made1.core.data.source.remote.response.tv

import com.google.gson.annotations.SerializedName

data class Tv(
    @SerializedName("id")
    var id: Int,

    @SerializedName("overview")
    var overview: String?=null,

    @SerializedName("poster_path")
    var posterPath: String?=null,

    @SerializedName("first_air_date")
    var firstAirDate: String?=null,

    @SerializedName("name")
    var name: String,

    @SerializedName("vote_average")
    var voteAverage: Double?=null,

    @SerializedName("vote_count")
    var voteCount: Int?=null,

    @SerializedName("popularity")
    var popularity: Double?=null
)
