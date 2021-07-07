package com.dimas.made1.core.utils

import androidx.sqlite.db.SimpleSQLiteQuery

object Sorting {
    const val BEST_RATING = "Rating"
    const val VOTING = "Voting"
    const val DEFAULT = "Default"
    const val MOVIE_ENTITIES = "movie"
    const val TV_SHOW_ENTITIES = "tv"

    fun getSortedQuery(filter: String, tableName: String): SimpleSQLiteQuery {
        val simpleQuery = StringBuilder().append("SELECT * FROM $tableName ")
        when (filter) {
            DEFAULT -> {
                simpleQuery.append("ORDER BY id ASC")
            }
            BEST_RATING -> {
                simpleQuery.append("ORDER BY vote_average DESC")
            }
            VOTING -> {
                simpleQuery.append("ORDER BY vote_count DESC")
            }
        }
        return SimpleSQLiteQuery(simpleQuery.toString())
    }


}