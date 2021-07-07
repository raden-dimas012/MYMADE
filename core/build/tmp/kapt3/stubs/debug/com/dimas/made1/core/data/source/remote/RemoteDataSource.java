package com.dimas.made1.core.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/dimas/made1/core/data/source/remote/RemoteDataSource;", "", "apiService", "Lcom/dimas/made1/core/data/source/remote/network/ApiService;", "(Lcom/dimas/made1/core/data/source/remote/network/ApiService;)V", "apiKey", "", "getMovies", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dimas/made1/core/data/source/remote/network/ApiResponse;", "", "Lcom/dimas/made1/core/data/source/remote/response/movie/Movie;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTv", "Lcom/dimas/made1/core/data/source/remote/response/tv/Tv;", "core_debug"})
public final class RemoteDataSource {
    private final com.dimas.made1.core.data.source.remote.network.ApiService apiService = null;
    private final java.lang.String apiKey = "4746c159906a043756027434ece41ed7";
    
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.dimas.made1.core.data.source.remote.network.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.dimas.made1.core.data.source.remote.network.ApiResponse<? extends java.util.List<com.dimas.made1.core.data.source.remote.response.movie.Movie>>>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTv(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.dimas.made1.core.data.source.remote.network.ApiResponse<? extends java.util.List<com.dimas.made1.core.data.source.remote.response.tv.Tv>>>> p0) {
        return null;
    }
}