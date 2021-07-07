package com.dimas.made1.core.utils

import com.dimas.made1.core.data.source.local.entity.movie.MovieEntity
import com.dimas.made1.core.data.source.local.entity.tv.TvEntity
import com.dimas.made1.core.data.source.remote.response.movie.Movie
import com.dimas.made1.core.data.source.remote.response.tv.Tv
import com.dimas.made1.core.domain.model.DataDomain

object DataMapper {

    fun mapResponseToEntityMovie(input: List<Movie>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
            val movie = MovieEntity(
                id = it.id.toString(),
                name = it.name,
                posterPath = it.posterPath,
                releaseDate = it.releaseDate,
                voteAverage = it.voteAverage,
                overview = it.overview,
                popularity = it.popularity,
                voteCount = it.voteCount,
                isFavorite = false
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapEntitiesToDomainMovie(input: List<MovieEntity>): List<DataDomain> =
        input.map {
            DataDomain(
                id = it.id,
                name = it.name,
                posterPath = it.posterPath,
                releaseDate = it.releaseDate,
                voteAverage = it.voteAverage,
                overview = it.overview,
                popularity = it.popularity,
                voteCount = it.voteCount,
                isFavorite = it.isFavorite
            )
        }

    fun mapDomainToEntityMovie(input: DataDomain) =
        MovieEntity(
            id = input.id,
            name = input.name,
            posterPath = input.posterPath,
            releaseDate = input.releaseDate,
            voteAverage = input.voteAverage,
            overview = input.overview,
            popularity = input.popularity,
            voteCount = input.voteCount,
            isFavorite = input.isFavorite
        )


    fun mapResponseToEntityTv(input: List<Tv>): List<TvEntity> {
        val tvList = ArrayList<TvEntity>()
        input.map {
            val tv = TvEntity(
                id = it.id.toString(),
                name = it.name,
                overview = it.overview,
                popularity = it.popularity,
                posterPath = it.posterPath,
                firstAirDate = it.firstAirDate,
                voteCount = it.voteCount,
                voteAverage = it.voteAverage,
                isFavorite = false
            )
            tvList.add(tv)
        }
        return tvList
    }


    fun mapEntitiesToDomainTv(input: List<TvEntity>): List<DataDomain> =
        input.map {
            DataDomain(
                id = it.id,
                name = it.name,
                overview = it.overview,
                popularity = it.popularity,
                posterPath = it.posterPath,
                releaseDate = it.firstAirDate,
                voteCount = it.voteCount,
                voteAverage = it.voteAverage,
                isFavorite = it.isFavorite
            )
        }


    fun mapDomainToEntityTv(input: DataDomain) =
        TvEntity(
            id = input.id,
            name = input.name,
            overview = input.overview,
            popularity = input.popularity,
            posterPath = input.posterPath,
            firstAirDate = input.releaseDate,
            voteCount = input.voteCount,
            voteAverage = input.voteAverage,
            isFavorite = input.isFavorite
        )


}
