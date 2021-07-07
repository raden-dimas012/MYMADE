package com.dimas.made1.core.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\"\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H&J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\u0006\u0010\r\u001a\u00020\bH&J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\u0006\u0010\r\u001a\u00020\bH&J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H&\u00a8\u0006\u0016"}, d2 = {"Lcom/dimas/made1/core/domain/repository/IDataRepository;", "", "getAllMovies", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dimas/made1/core/data/repository/Resource;", "", "Lcom/dimas/made1/core/domain/model/DataDomain;", "sort", "", "getAllTv", "getFavoriteMovies", "getFavoriteTv", "getSearchMovies", "search", "getSearchTv", "setMovieFavorite", "", "movie", "state", "", "setTvFavorite", "tv", "core_debug"})
public abstract interface IDataRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.dimas.made1.core.data.repository.Resource<java.util.List<com.dimas.made1.core.domain.model.DataDomain>>> getAllMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String sort);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.dimas.made1.core.data.repository.Resource<java.util.List<com.dimas.made1.core.domain.model.DataDomain>>> getAllTv(@org.jetbrains.annotations.NotNull()
    java.lang.String sort);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.domain.model.DataDomain>> getFavoriteMovies();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.domain.model.DataDomain>> getFavoriteTv();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.domain.model.DataDomain>> getSearchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String search);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.domain.model.DataDomain>> getSearchTv(@org.jetbrains.annotations.NotNull()
    java.lang.String search);
    
    public abstract void setMovieFavorite(@org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.domain.model.DataDomain movie, boolean state);
    
    public abstract void setTvFavorite(@org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.domain.model.DataDomain tv, boolean state);
}