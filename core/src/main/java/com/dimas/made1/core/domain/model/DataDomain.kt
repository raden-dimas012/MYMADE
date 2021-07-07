package com.dimas.made1.core.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataDomain(
    var id: String,
    var overview: String?=null,
    var posterPath: String?=null,
    var releaseDate: String?=null,
    var name: String,
    var voteAverage: Double?=null,
    var voteCount: Int?=null,
    var popularity: Double?=null,
    var isFavorite: Boolean = false
) : Parcelable

