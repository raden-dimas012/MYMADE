package com.dimas.made1.core.data.source.local.room


import androidx.room.*
import androidx.sqlite.db.SimpleSQLiteQuery
import com.dimas.made1.core.data.source.local.entity.movie.MovieEntity
import com.dimas.made1.core.data.source.local.entity.tv.TvEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AppDao {

    @RawQuery(observedEntities = [MovieEntity::class])
    fun getMovies(query: SimpleSQLiteQuery): Flow<List<MovieEntity>>

    @Query("SELECT * FROM movie WHERE is_favorite = 1")
    fun getFavoriteMovies(): Flow<List<MovieEntity>>

    @Query("SELECT * FROM movie WHERE name LIKE '%' || :search || '%'")
    fun getSearchMovies(search: String): Flow<List<MovieEntity>>

    @RawQuery(observedEntities = [TvEntity::class])
    fun getTv(query: SimpleSQLiteQuery): Flow<List<TvEntity>>

    @Query("SELECT * FROM tv WHERE is_favorite = 1")
    fun getFavoriteTv(): Flow<List<TvEntity>>

    @Query("SELECT * FROM tv WHERE name LIKE '%' || :search || '%'")
    fun getSearchTv(search: String): Flow<List<TvEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovies(movies: List<MovieEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTv(tv: List<TvEntity>)

    @Update
    fun updateMovie(movie: MovieEntity)

    @Update
    fun updateTv(tv: TvEntity)

}