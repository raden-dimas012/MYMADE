package com.dimas.made1.core.data.source.local.entity.movie

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "movie")
data class MovieEntity(
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    var id: String,

    @ColumnInfo(name = "overview")
    var overview: String?=null,

    @ColumnInfo(name = "poster_path")
    var posterPath: String?=null,

    @ColumnInfo(name = "release_date")
    var releaseDate: String?=null,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "vote_average")
    var voteAverage: Double?=null,

    @ColumnInfo(name = "vote_count")
    var voteCount: Int?=null,

    @ColumnInfo(name = "popularity")
    var popularity: Double?=null,

    @ColumnInfo(name = "is_favorite")
    var isFavorite: Boolean = false,

)
