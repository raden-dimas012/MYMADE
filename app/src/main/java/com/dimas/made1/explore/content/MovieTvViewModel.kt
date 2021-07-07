package com.dimas.made1.explore.content

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dimas.made1.core.data.repository.Resource
import com.dimas.made1.core.domain.model.DataDomain
import com.dimas.made1.core.domain.usecase.DataUseCase
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.flow.*

@FlowPreview
@ExperimentalCoroutinesApi
class MovieTvViewModel(private val dataUseCase: DataUseCase) : ViewModel() {
    private val queryChannel = ConflatedBroadcastChannel<String>()


    fun getMovies(sort: String): LiveData<Resource<List<DataDomain>>> =
        dataUseCase.getAllMovies(sort).asLiveData()

    fun getTv(sort: String): LiveData<Resource<List<DataDomain>>> =
        dataUseCase.getAllTv(sort).asLiveData()

    fun setSearchQuery(search: String) {
        queryChannel.offer(search)
    }

    val movieResult = queryChannel.asFlow()
        .debounce(300)
        .distinctUntilChanged()
        .filter {
            it.trim().isNotEmpty()
        }
        .flatMapLatest {
            dataUseCase.getSearchMovies(it)
        }.asLiveData()

    val tvResult = queryChannel.asFlow()
        .debounce(300)
        .distinctUntilChanged()
        .filter {
            it.trim().isNotEmpty()
        }
        .flatMapLatest {
            dataUseCase.getSearchTv(it)
        }.asLiveData()
}