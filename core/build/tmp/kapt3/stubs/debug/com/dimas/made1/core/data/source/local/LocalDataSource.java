package com.dimas.made1.core.data.source.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\rJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\rJ\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\f\u001a\u00020\rJ\u001f\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/dimas/made1/core/data/source/local/LocalDataSource;", "", "mAppDao", "Lcom/dimas/made1/core/data/source/local/room/AppDao;", "(Lcom/dimas/made1/core/data/source/local/room/AppDao;)V", "getFavoriteMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/dimas/made1/core/data/source/local/entity/movie/MovieEntity;", "getFavoriteTv", "Lcom/dimas/made1/core/data/source/local/entity/tv/TvEntity;", "getMovieSearch", "search", "", "getMovies", "sort", "getTv", "getTvSearch", "insertMovies", "", "movies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertTv", "tvShows", "setFavoriteMovie", "movie", "newState", "", "setFavoriteTv", "tvShow", "core_debug"})
public final class LocalDataSource {
    private final com.dimas.made1.core.data.source.local.room.AppDao mAppDao = null;
    
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.data.source.local.room.AppDao mAppDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.data.source.local.entity.movie.MovieEntity>> getMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String sort) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.data.source.local.entity.movie.MovieEntity>> getFavoriteMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dimas.made1.core.data.source.local.entity.movie.MovieEntity> movies, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void setFavoriteMovie(@org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.data.source.local.entity.movie.MovieEntity movie, boolean newState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.data.source.local.entity.movie.MovieEntity>> getMovieSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String search) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.data.source.local.entity.tv.TvEntity>> getTv(@org.jetbrains.annotations.NotNull()
    java.lang.String sort) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.data.source.local.entity.tv.TvEntity>> getFavoriteTv() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTv(@org.jetbrains.annotations.NotNull()
    java.util.List<com.dimas.made1.core.data.source.local.entity.tv.TvEntity> tvShows, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void setFavoriteTv(@org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.data.source.local.entity.tv.TvEntity tvShow, boolean newState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.data.source.local.entity.tv.TvEntity>> getTvSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String search) {
        return null;
    }
}