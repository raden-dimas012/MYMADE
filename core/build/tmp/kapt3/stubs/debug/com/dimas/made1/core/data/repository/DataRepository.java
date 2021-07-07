package com.dimas.made1.core.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nH\u0016J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nH\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/dimas/made1/core/data/repository/DataRepository;", "Lcom/dimas/made1/core/domain/repository/IDataRepository;", "remoteDataSource", "Lcom/dimas/made1/core/data/source/remote/RemoteDataSource;", "localDataSource", "Lcom/dimas/made1/core/data/source/local/LocalDataSource;", "appExecutors", "Lcom/dimas/made1/core/utils/AppExecutors;", "(Lcom/dimas/made1/core/data/source/remote/RemoteDataSource;Lcom/dimas/made1/core/data/source/local/LocalDataSource;Lcom/dimas/made1/core/utils/AppExecutors;)V", "getAllMovies", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dimas/made1/core/data/repository/Resource;", "", "Lcom/dimas/made1/core/domain/model/DataDomain;", "sort", "", "getAllTv", "getFavoriteMovies", "getFavoriteTv", "getSearchMovies", "search", "getSearchTv", "setMovieFavorite", "", "movie", "state", "", "setTvFavorite", "tv", "core_debug"})
public final class DataRepository implements com.dimas.made1.core.domain.repository.IDataRepository {
    private final com.dimas.made1.core.data.source.remote.RemoteDataSource remoteDataSource = null;
    private final com.dimas.made1.core.data.source.local.LocalDataSource localDataSource = null;
    private final com.dimas.made1.core.utils.AppExecutors appExecutors = null;
    
    public DataRepository(@org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.data.source.remote.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.data.source.local.LocalDataSource localDataSource, @org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.utils.AppExecutors appExecutors) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.dimas.made1.core.data.repository.Resource<java.util.List<com.dimas.made1.core.domain.model.DataDomain>>> getAllMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String sort) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.dimas.made1.core.data.repository.Resource<java.util.List<com.dimas.made1.core.domain.model.DataDomain>>> getAllTv(@org.jetbrains.annotations.NotNull()
    java.lang.String sort) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.domain.model.DataDomain>> getFavoriteMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.domain.model.DataDomain>> getFavoriteTv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.domain.model.DataDomain>> getSearchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String search) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.dimas.made1.core.domain.model.DataDomain>> getSearchTv(@org.jetbrains.annotations.NotNull()
    java.lang.String search) {
        return null;
    }
    
    @java.lang.Override()
    public void setMovieFavorite(@org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.domain.model.DataDomain movie, boolean state) {
    }
    
    @java.lang.Override()
    public void setTvFavorite(@org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.domain.model.DataDomain tv, boolean state) {
    }
}