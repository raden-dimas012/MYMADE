package com.dimas.made1.core.data.source.local.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile AppDao _appDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `movie` (`id` TEXT NOT NULL, `overview` TEXT, `poster_path` TEXT, `release_date` TEXT, `name` TEXT NOT NULL, `vote_average` REAL, `vote_count` INTEGER, `popularity` REAL, `is_favorite` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tv` (`id` TEXT NOT NULL, `overview` TEXT, `poster_path` TEXT, `first_air_date` TEXT, `name` TEXT NOT NULL, `vote_average` REAL, `vote_count` INTEGER, `popularity` REAL, `is_favorite` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c1d2328abe81526ae5886e3998c3a495')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `movie`");
        _db.execSQL("DROP TABLE IF EXISTS `tv`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMovie = new HashMap<String, TableInfo.Column>(9);
        _columnsMovie.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovie.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovie.put("poster_path", new TableInfo.Column("poster_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovie.put("release_date", new TableInfo.Column("release_date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovie.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovie.put("vote_average", new TableInfo.Column("vote_average", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovie.put("vote_count", new TableInfo.Column("vote_count", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovie.put("popularity", new TableInfo.Column("popularity", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovie.put("is_favorite", new TableInfo.Column("is_favorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovie = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovie = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovie = new TableInfo("movie", _columnsMovie, _foreignKeysMovie, _indicesMovie);
        final TableInfo _existingMovie = TableInfo.read(_db, "movie");
        if (! _infoMovie.equals(_existingMovie)) {
          return new RoomOpenHelper.ValidationResult(false, "movie(com.dimas.made1.core.data.source.local.entity.movie.MovieEntity).\n"
                  + " Expected:\n" + _infoMovie + "\n"
                  + " Found:\n" + _existingMovie);
        }
        final HashMap<String, TableInfo.Column> _columnsTv = new HashMap<String, TableInfo.Column>(9);
        _columnsTv.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTv.put("overview", new TableInfo.Column("overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTv.put("poster_path", new TableInfo.Column("poster_path", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTv.put("first_air_date", new TableInfo.Column("first_air_date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTv.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTv.put("vote_average", new TableInfo.Column("vote_average", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTv.put("vote_count", new TableInfo.Column("vote_count", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTv.put("popularity", new TableInfo.Column("popularity", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTv.put("is_favorite", new TableInfo.Column("is_favorite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTv = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTv = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTv = new TableInfo("tv", _columnsTv, _foreignKeysTv, _indicesTv);
        final TableInfo _existingTv = TableInfo.read(_db, "tv");
        if (! _infoTv.equals(_existingTv)) {
          return new RoomOpenHelper.ValidationResult(false, "tv(com.dimas.made1.core.data.source.local.entity.tv.TvEntity).\n"
                  + " Expected:\n" + _infoTv + "\n"
                  + " Found:\n" + _existingTv);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "c1d2328abe81526ae5886e3998c3a495", "b4f3a2f482ebf4b2606a420087161405");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "movie","tv");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `movie`");
      _db.execSQL("DELETE FROM `tv`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(AppDao.class, AppDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public AppDao appDao() {
    if (_appDao != null) {
      return _appDao;
    } else {
      synchronized(this) {
        if(_appDao == null) {
          _appDao = new AppDao_Impl(this);
        }
        return _appDao;
      }
    }
  }
}
