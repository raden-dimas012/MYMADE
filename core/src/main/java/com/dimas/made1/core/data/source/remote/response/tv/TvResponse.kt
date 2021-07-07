package com.dimas.made1.core.data.source.remote.response.tv

import com.google.gson.annotations.SerializedName

data class TvResponse(
    @SerializedName("results")
    val results: List<Tv>
)
