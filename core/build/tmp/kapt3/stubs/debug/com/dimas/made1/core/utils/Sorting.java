package com.dimas.made1.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/dimas/made1/core/utils/Sorting;", "", "()V", "BEST_RATING", "", "DEFAULT", "MOVIE_ENTITIES", "TV_SHOW_ENTITIES", "VOTING", "getSortedQuery", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "filter", "tableName", "core_debug"})
public final class Sorting {
    @org.jetbrains.annotations.NotNull()
    public static final com.dimas.made1.core.utils.Sorting INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BEST_RATING = "Rating";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VOTING = "Voting";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT = "Default";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_ENTITIES = "movie";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TV_SHOW_ENTITIES = "tv";
    
    private Sorting() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.sqlite.db.SimpleSQLiteQuery getSortedQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String filter, @org.jetbrains.annotations.NotNull()
    java.lang.String tableName) {
        return null;
    }
}