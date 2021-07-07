package com.dimas.made1.core.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dimas.made1.core.data.source.local.entity.movie.MovieEntity
import com.dimas.made1.core.data.source.local.entity.tv.TvEntity

@Database(
    entities = [MovieEntity::class, TvEntity::class],
    version = 1,
    exportSchema = false
)

abstract class AppDatabase : RoomDatabase() {
    abstract fun appDao(): AppDao
}