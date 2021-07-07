package com.dimas.made1.favorite.di

import com.dimas.made1.favorite.content.FavoriteMovieTvViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object FavoriteModule {

    val viewModel = module {
        viewModel { FavoriteMovieTvViewModel(get()) }
    }
}