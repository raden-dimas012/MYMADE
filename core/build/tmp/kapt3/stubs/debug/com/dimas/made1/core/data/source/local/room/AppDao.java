package com.dimas.made1.core.data.source.local.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\t\u001a\u00020\nH\'J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\f\u001a\u00020\rH\'J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\u0006\u0010\f\u001a\u00020\rH\'J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\u0006\u0010\t\u001a\u00020\nH\'J\u001f\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0005H\'J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0007H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/dimas/made1/core/data/source/local/room/AppDao;", "", "getFavoriteMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/dimas/made1/core/data/source/local/entity/movie/MovieEntity;", "getFavoriteTv", "Lcom/dimas/made1/core/data/source/local/entity/tv/TvEntity;", "getMovies", "query", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "getSearchMovies", "search", "", "getSearchTv", "getTv", "insertMovies", "", "movies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTv", "tv", "updateMovie", "movie", "updateTv", "core_debug"})
public abstract interface AppDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.dimas.made1.core.data.source.local.entity.movie.MovieEntity.class})
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.data.source.local.entity.movie.MovieEntity>> getMovies(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SimpleSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie WHERE is_favorite = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.data.source.local.entity.movie.MovieEntity>> getFavoriteMovies();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie WHERE name LIKE \'%\' || :search || \'%\'")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.data.source.local.entity.movie.MovieEntity>> getSearchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String search);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RawQuery(observedEntities = {com.dimas.made1.core.data.source.local.entity.tv.TvEntity.class})
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.data.source.local.entity.tv.TvEntity>> getTv(@org.jetbrains.annotations.NotNull()
    androidx.sqlite.db.SimpleSQLiteQuery query);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tv WHERE is_favorite = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.data.source.local.entity.tv.TvEntity>> getFavoriteTv();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM tv WHERE name LIKE \'%\' || :search || \'%\'")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.data.source.local.entity.tv.TvEntity>> getSearchTv(@org.jetbrains.annotations.NotNull()
    java.lang.String search);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dimas.made1.core.data.source.local.entity.movie.MovieEntity> movies, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertTv(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dimas.made1.core.data.source.local.entity.tv.TvEntity> tv, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @androidx.room.Update()
    public abstract void updateMovie(@org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.data.source.local.entity.movie.MovieEntity movie);
    
    @androidx.room.Update()
    public abstract void updateTv(@org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.data.source.local.entity.tv.TvEntity tv);
}