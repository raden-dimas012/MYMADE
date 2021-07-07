package com.dimas.made1.core.data.source.local

import com.dimas.made1.core.data.source.local.entity.movie.MovieEntity
import com.dimas.made1.core.data.source.local.entity.tv.TvEntity
import com.dimas.made1.core.data.source.local.room.AppDao
import com.dimas.made1.core.utils.Sorting
import com.dimas.made1.core.utils.Sorting.MOVIE_ENTITIES
import com.dimas.made1.core.utils.Sorting.TV_SHOW_ENTITIES
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn

class LocalDataSource(private val mAppDao: AppDao) {


    fun getMovies(sort: String): Flow<List<MovieEntity>> =
        mAppDao.getMovies(Sorting.getSortedQuery(sort, MOVIE_ENTITIES))

    fun getFavoriteMovies() = mAppDao.getFavoriteMovies()

    suspend fun insertMovies(movies: List<MovieEntity>) = mAppDao.insertMovies(movies)

    fun setFavoriteMovie(movie: MovieEntity, newState: Boolean) {
        movie.isFavorite = newState
        mAppDao.updateMovie(movie)
    }

    fun getMovieSearch(search: String): Flow<List<MovieEntity>> {
        return mAppDao.getSearchMovies(search)
            .flowOn(Dispatchers.Default)
            .conflate()
    }


    fun getTv(sort: String) = mAppDao.getTv(Sorting.getSortedQuery(sort, TV_SHOW_ENTITIES))

    fun getFavoriteTv() = mAppDao.getFavoriteTv()

    suspend fun insertTv(tvShows: List<TvEntity>) = mAppDao.insertTv(tvShows)

    fun setFavoriteTv(tvShow: TvEntity, newState: Boolean) {
        tvShow.isFavorite = newState
        mAppDao.updateTv(tvShow)
    }

    fun getTvSearch(search: String): Flow<List<TvEntity>> {
        return mAppDao.getSearchTv(search)
            .flowOn(Dispatchers.Default)
            .conflate()
    }

}