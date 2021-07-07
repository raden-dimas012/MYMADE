package com.dimas.made1.core.data.source.remote.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/dimas/made1/core/data/source/remote/network/ApiService;", "", "getMovies", "Lcom/dimas/made1/core/data/source/remote/response/movie/MovieResponse;", "apiKey", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTv", "Lcom/dimas/made1/core/data/source/remote/response/tv/TvResponse;", "core_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "movie/popular")
    public abstract java.lang.Object getMovies(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dimas.made1.core.data.source.remote.response.movie.MovieResponse> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tv/popular")
    public abstract java.lang.Object getTv(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.dimas.made1.core.data.source.remote.response.tv.TvResponse> p1);
}