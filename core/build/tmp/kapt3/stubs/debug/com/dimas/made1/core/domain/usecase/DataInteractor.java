package com.dimas.made1.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\"\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/dimas/made1/core/domain/usecase/DataInteractor;", "Lcom/dimas/made1/core/domain/usecase/DataUseCase;", "iDataRepository", "Lcom/dimas/made1/core/domain/repository/IDataRepository;", "(Lcom/dimas/made1/core/domain/repository/IDataRepository;)V", "getAllMovies", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dimas/made1/core/data/repository/Resource;", "", "Lcom/dimas/made1/core/domain/model/DataDomain;", "sort", "", "getAllTv", "getFavoriteMovies", "getFavoriteTv", "getSearchMovies", "search", "getSearchTv", "setMovieFavorite", "", "movie", "state", "", "setTvFavorite", "tv", "core_debug"})
public final class DataInteractor implements com.dimas.made1.core.domain.usecase.DataUseCase {
    private final com.dimas.made1.core.domain.repository.IDataRepository iDataRepository = null;
    
    public DataInteractor(@org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.domain.repository.IDataRepository iDataRepository) {
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