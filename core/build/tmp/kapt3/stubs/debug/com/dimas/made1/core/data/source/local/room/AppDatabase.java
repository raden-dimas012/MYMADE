package com.dimas.made1.core.data.source.local.room;

import java.lang.System;

@androidx.room.Database(entities = {com.dimas.made1.core.data.source.local.entity.movie.MovieEntity.class, com.dimas.made1.core.data.source.local.entity.tv.TvEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/dimas/made1/core/data/source/local/room/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "appDao", "Lcom/dimas/made1/core/data/source/local/room/AppDao;", "core_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.dimas.made1.core.data.source.local.room.AppDao appDao();
}