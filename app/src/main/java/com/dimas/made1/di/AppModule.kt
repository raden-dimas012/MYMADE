package com.dimas.made1.di

import com.dimas.made1.core.domain.usecase.DataInteractor
import com.dimas.made1.core.domain.usecase.DataUseCase
import com.dimas.made1.detail.DetailViewModel
import com.dimas.made1.explore.content.MovieTvViewModel
import com.dimas.made1.home.content.ContentViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

@ExperimentalCoroutinesApi
@FlowPreview
object AppModule {

    val useCaseModule = module {
        factory<DataUseCase> { DataInteractor(get()) }
    }

    val viewModelModule = module {
        viewModel { DetailViewModel(get()) }
        viewModel { MovieTvViewModel(get()) }
        viewModel { ContentViewModel(get()) }
    }
}