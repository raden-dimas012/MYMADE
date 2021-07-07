package com.dimas.made1.core.data.source.local.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.dimas.made1.core.data.source.local.entity.movie.MovieEntity;
import com.dimas.made1.core.data.source.local.entity.tv.TvEntity;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDao_Impl implements AppDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MovieEntity> __insertionAdapterOfMovieEntity;

  private final EntityInsertionAdapter<TvEntity> __insertionAdapterOfTvEntity;

  private final EntityDeletionOrUpdateAdapter<MovieEntity> __updateAdapterOfMovieEntity;

  private final EntityDeletionOrUpdateAdapter<TvEntity> __updateAdapterOfTvEntity;

  public AppDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovieEntity = new EntityInsertionAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `movie` (`id`,`overview`,`poster_path`,`release_date`,`name`,`vote_average`,`vote_count`,`popularity`,`is_favorite`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOverview());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPosterPath());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getReleaseDate());
        }
        if (value.getName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getName());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getVoteAverage());
        }
        if (value.getVoteCount() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getVoteCount());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getPopularity());
        }
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(9, _tmp);
      }
    };
    this.__insertionAdapterOfTvEntity = new EntityInsertionAdapter<TvEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `tv` (`id`,`overview`,`poster_path`,`first_air_date`,`name`,`vote_average`,`vote_count`,`popularity`,`is_favorite`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOverview());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPosterPath());
        }
        if (value.getFirstAirDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFirstAirDate());
        }
        if (value.getName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getName());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getVoteAverage());
        }
        if (value.getVoteCount() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getVoteCount());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getPopularity());
        }
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(9, _tmp);
      }
    };
    this.__updateAdapterOfMovieEntity = new EntityDeletionOrUpdateAdapter<MovieEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `movie` SET `id` = ?,`overview` = ?,`poster_path` = ?,`release_date` = ?,`name` = ?,`vote_average` = ?,`vote_count` = ?,`popularity` = ?,`is_favorite` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MovieEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOverview());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPosterPath());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getReleaseDate());
        }
        if (value.getName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getName());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getVoteAverage());
        }
        if (value.getVoteCount() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getVoteCount());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getPopularity());
        }
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(9, _tmp);
        if (value.getId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getId());
        }
      }
    };
    this.__updateAdapterOfTvEntity = new EntityDeletionOrUpdateAdapter<TvEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `tv` SET `id` = ?,`overview` = ?,`poster_path` = ?,`first_air_date` = ?,`name` = ?,`vote_average` = ?,`vote_count` = ?,`popularity` = ?,`is_favorite` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TvEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOverview());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPosterPath());
        }
        if (value.getFirstAirDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFirstAirDate());
        }
        if (value.getName() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getName());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindDouble(6, value.getVoteAverage());
        }
        if (value.getVoteCount() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getVoteCount());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getPopularity());
        }
        final int _tmp;
        _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(9, _tmp);
        if (value.getId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getId());
        }
      }
    };
  }

  @Override
  public Object insertMovies(final List<MovieEntity> movies, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovieEntity.insert(movies);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insertTv(final List<TvEntity> tv, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTvEntity.insert(tv);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void updateMovie(final MovieEntity movie) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfMovieEntity.handle(movie);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateTv(final TvEntity tv) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTvEntity.handle(tv);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<MovieEntity>> getFavoriteMovies() {
    final String _sql = "SELECT * FROM movie WHERE is_favorite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"movie"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final Integer _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new MovieEntity(_tmpId,_tmpOverview,_tmpPosterPath,_tmpReleaseDate,_tmpName,_tmpVoteAverage,_tmpVoteCount,_tmpPopularity,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<MovieEntity>> getSearchMovies(final String search) {
    final String _sql = "SELECT * FROM movie WHERE name LIKE '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (search == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, search);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"movie"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "release_date");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpReleaseDate;
            if (_cursor.isNull(_cursorIndexOfReleaseDate)) {
              _tmpReleaseDate = null;
            } else {
              _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final Integer _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new MovieEntity(_tmpId,_tmpOverview,_tmpPosterPath,_tmpReleaseDate,_tmpName,_tmpVoteAverage,_tmpVoteCount,_tmpPopularity,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TvEntity>> getFavoriteTv() {
    final String _sql = "SELECT * FROM tv WHERE is_favorite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tv"}, new Callable<List<TvEntity>>() {
      @Override
      public List<TvEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "first_air_date");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
          final List<TvEntity> _result = new ArrayList<TvEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TvEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpFirstAirDate;
            if (_cursor.isNull(_cursorIndexOfFirstAirDate)) {
              _tmpFirstAirDate = null;
            } else {
              _tmpFirstAirDate = _cursor.getString(_cursorIndexOfFirstAirDate);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final Integer _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new TvEntity(_tmpId,_tmpOverview,_tmpPosterPath,_tmpFirstAirDate,_tmpName,_tmpVoteAverage,_tmpVoteCount,_tmpPopularity,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<TvEntity>> getSearchTv(final String search) {
    final String _sql = "SELECT * FROM tv WHERE name LIKE '%' || ? || '%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (search == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, search);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tv"}, new Callable<List<TvEntity>>() {
      @Override
      public List<TvEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "overview");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "poster_path");
          final int _cursorIndexOfFirstAirDate = CursorUtil.getColumnIndexOrThrow(_cursor, "first_air_date");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_average");
          final int _cursorIndexOfVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "vote_count");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "popularity");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favorite");
          final List<TvEntity> _result = new ArrayList<TvEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TvEntity _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpOverview;
            if (_cursor.isNull(_cursorIndexOfOverview)) {
              _tmpOverview = null;
            } else {
              _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final String _tmpFirstAirDate;
            if (_cursor.isNull(_cursorIndexOfFirstAirDate)) {
              _tmpFirstAirDate = null;
            } else {
              _tmpFirstAirDate = _cursor.getString(_cursorIndexOfFirstAirDate);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            final Integer _tmpVoteCount;
            if (_cursor.isNull(_cursorIndexOfVoteCount)) {
              _tmpVoteCount = null;
            } else {
              _tmpVoteCount = _cursor.getInt(_cursorIndexOfVoteCount);
            }
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new TvEntity(_tmpId,_tmpOverview,_tmpPosterPath,_tmpFirstAirDate,_tmpName,_tmpVoteAverage,_tmpVoteCount,_tmpPopularity,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<MovieEntity>> getMovies(final SimpleSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return CoroutinesRoom.createFlow(__db, false, new String[]{"movie"}, new Callable<List<MovieEntity>>() {
      @Override
      public List<MovieEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final List<MovieEntity> _result = new ArrayList<MovieEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MovieEntity _item;
            _item = __entityCursorConverter_comDimasMade1CoreDataSourceLocalEntityMovieMovieEntity(_cursor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }
    });
  }

  @Override
  public Flow<List<TvEntity>> getTv(final SimpleSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tv"}, new Callable<List<TvEntity>>() {
      @Override
      public List<TvEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final List<TvEntity> _result = new ArrayList<TvEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TvEntity _item;
            _item = __entityCursorConverter_comDimasMade1CoreDataSourceLocalEntityTvTvEntity(_cursor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private MovieEntity __entityCursorConverter_comDimasMade1CoreDataSourceLocalEntityMovieMovieEntity(
      Cursor cursor) {
    final MovieEntity _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("id");
    final int _cursorIndexOfOverview = cursor.getColumnIndex("overview");
    final int _cursorIndexOfPosterPath = cursor.getColumnIndex("poster_path");
    final int _cursorIndexOfReleaseDate = cursor.getColumnIndex("release_date");
    final int _cursorIndexOfName = cursor.getColumnIndex("name");
    final int _cursorIndexOfVoteAverage = cursor.getColumnIndex("vote_average");
    final int _cursorIndexOfVoteCount = cursor.getColumnIndex("vote_count");
    final int _cursorIndexOfPopularity = cursor.getColumnIndex("popularity");
    final int _cursorIndexOfIsFavorite = cursor.getColumnIndex("is_favorite");
    final String _tmpId;
    if (_cursorIndexOfId == -1) {
      _tmpId = null;
    } else {
      if (cursor.isNull(_cursorIndexOfId)) {
        _tmpId = null;
      } else {
        _tmpId = cursor.getString(_cursorIndexOfId);
      }
    }
    final String _tmpOverview;
    if (_cursorIndexOfOverview == -1) {
      _tmpOverview = null;
    } else {
      if (cursor.isNull(_cursorIndexOfOverview)) {
        _tmpOverview = null;
      } else {
        _tmpOverview = cursor.getString(_cursorIndexOfOverview);
      }
    }
    final String _tmpPosterPath;
    if (_cursorIndexOfPosterPath == -1) {
      _tmpPosterPath = null;
    } else {
      if (cursor.isNull(_cursorIndexOfPosterPath)) {
        _tmpPosterPath = null;
      } else {
        _tmpPosterPath = cursor.getString(_cursorIndexOfPosterPath);
      }
    }
    final String _tmpReleaseDate;
    if (_cursorIndexOfReleaseDate == -1) {
      _tmpReleaseDate = null;
    } else {
      if (cursor.isNull(_cursorIndexOfReleaseDate)) {
        _tmpReleaseDate = null;
      } else {
        _tmpReleaseDate = cursor.getString(_cursorIndexOfReleaseDate);
      }
    }
    final String _tmpName;
    if (_cursorIndexOfName == -1) {
      _tmpName = null;
    } else {
      if (cursor.isNull(_cursorIndexOfName)) {
        _tmpName = null;
      } else {
        _tmpName = cursor.getString(_cursorIndexOfName);
      }
    }
    final Double _tmpVoteAverage;
    if (_cursorIndexOfVoteAverage == -1) {
      _tmpVoteAverage = null;
    } else {
      if (cursor.isNull(_cursorIndexOfVoteAverage)) {
        _tmpVoteAverage = null;
      } else {
        _tmpVoteAverage = cursor.getDouble(_cursorIndexOfVoteAverage);
      }
    }
    final Integer _tmpVoteCount;
    if (_cursorIndexOfVoteCount == -1) {
      _tmpVoteCount = null;
    } else {
      if (cursor.isNull(_cursorIndexOfVoteCount)) {
        _tmpVoteCount = null;
      } else {
        _tmpVoteCount = cursor.getInt(_cursorIndexOfVoteCount);
      }
    }
    final Double _tmpPopularity;
    if (_cursorIndexOfPopularity == -1) {
      _tmpPopularity = null;
    } else {
      if (cursor.isNull(_cursorIndexOfPopularity)) {
        _tmpPopularity = null;
      } else {
        _tmpPopularity = cursor.getDouble(_cursorIndexOfPopularity);
      }
    }
    final boolean _tmpIsFavorite;
    if (_cursorIndexOfIsFavorite == -1) {
      _tmpIsFavorite = false;
    } else {
      final int _tmp;
      _tmp = cursor.getInt(_cursorIndexOfIsFavorite);
      _tmpIsFavorite = _tmp != 0;
    }
    _entity = new MovieEntity(_tmpId,_tmpOverview,_tmpPosterPath,_tmpReleaseDate,_tmpName,_tmpVoteAverage,_tmpVoteCount,_tmpPopularity,_tmpIsFavorite);
    return _entity;
  }

  private TvEntity __entityCursorConverter_comDimasMade1CoreDataSourceLocalEntityTvTvEntity(
      Cursor cursor) {
    final TvEntity _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("id");
    final int _cursorIndexOfOverview = cursor.getColumnIndex("overview");
    final int _cursorIndexOfPosterPath = cursor.getColumnIndex("poster_path");
    final int _cursorIndexOfFirstAirDate = cursor.getColumnIndex("first_air_date");
    final int _cursorIndexOfName = cursor.getColumnIndex("name");
    final int _cursorIndexOfVoteAverage = cursor.getColumnIndex("vote_average");
    final int _cursorIndexOfVoteCount = cursor.getColumnIndex("vote_count");
    final int _cursorIndexOfPopularity = cursor.getColumnIndex("popularity");
    final int _cursorIndexOfIsFavorite = cursor.getColumnIndex("is_favorite");
    final String _tmpId;
    if (_cursorIndexOfId == -1) {
      _tmpId = null;
    } else {
      if (cursor.isNull(_cursorIndexOfId)) {
        _tmpId = null;
      } else {
        _tmpId = cursor.getString(_cursorIndexOfId);
      }
    }
    final String _tmpOverview;
    if (_cursorIndexOfOverview == -1) {
      _tmpOverview = null;
    } else {
      if (cursor.isNull(_cursorIndexOfOverview)) {
        _tmpOverview = null;
      } else {
        _tmpOverview = cursor.getString(_cursorIndexOfOverview);
      }
    }
    final String _tmpPosterPath;
    if (_cursorIndexOfPosterPath == -1) {
      _tmpPosterPath = null;
    } else {
      if (cursor.isNull(_cursorIndexOfPosterPath)) {
        _tmpPosterPath = null;
      } else {
        _tmpPosterPath = cursor.getString(_cursorIndexOfPosterPath);
      }
    }
    final String _tmpFirstAirDate;
    if (_cursorIndexOfFirstAirDate == -1) {
      _tmpFirstAirDate = null;
    } else {
      if (cursor.isNull(_cursorIndexOfFirstAirDate)) {
        _tmpFirstAirDate = null;
      } else {
        _tmpFirstAirDate = cursor.getString(_cursorIndexOfFirstAirDate);
      }
    }
    final String _tmpName;
    if (_cursorIndexOfName == -1) {
      _tmpName = null;
    } else {
      if (cursor.isNull(_cursorIndexOfName)) {
        _tmpName = null;
      } else {
        _tmpName = cursor.getString(_cursorIndexOfName);
      }
    }
    final Double _tmpVoteAverage;
    if (_cursorIndexOfVoteAverage == -1) {
      _tmpVoteAverage = null;
    } else {
      if (cursor.isNull(_cursorIndexOfVoteAverage)) {
        _tmpVoteAverage = null;
      } else {
        _tmpVoteAverage = cursor.getDouble(_cursorIndexOfVoteAverage);
      }
    }
    final Integer _tmpVoteCount;
    if (_cursorIndexOfVoteCount == -1) {
      _tmpVoteCount = null;
    } else {
      if (cursor.isNull(_cursorIndexOfVoteCount)) {
        _tmpVoteCount = null;
      } else {
        _tmpVoteCount = cursor.getInt(_cursorIndexOfVoteCount);
      }
    }
    final Double _tmpPopularity;
    if (_cursorIndexOfPopularity == -1) {
      _tmpPopularity = null;
    } else {
      if (cursor.isNull(_cursorIndexOfPopularity)) {
        _tmpPopularity = null;
      } else {
        _tmpPopularity = cursor.getDouble(_cursorIndexOfPopularity);
      }
    }
    final boolean _tmpIsFavorite;
    if (_cursorIndexOfIsFavorite == -1) {
      _tmpIsFavorite = false;
    } else {
      final int _tmp;
      _tmp = cursor.getInt(_cursorIndexOfIsFavorite);
      _tmpIsFavorite = _tmp != 0;
    }
    _entity = new TvEntity(_tmpId,_tmpOverview,_tmpPosterPath,_tmpFirstAirDate,_tmpName,_tmpVoteAverage,_tmpVoteCount,_tmpPopularity,_tmpIsFavorite);
    return _entity;
  }
}
