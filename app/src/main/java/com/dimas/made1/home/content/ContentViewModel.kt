package com.dimas.made1.home.content

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dimas.made1.core.data.repository.Resource
import com.dimas.made1.core.domain.model.DataDomain
import com.dimas.made1.core.domain.usecase.DataUseCase

class ContentViewModel(private val dataUseCase: DataUseCase) : ViewModel() {

    fun getMovies(sort: String): LiveData<Resource<List<DataDomain>>> =
        dataUseCase.getAllMovies(sort).asLiveData()


    fun getTv(sort: String): LiveData<Resource<List<DataDomain>>> =
        dataUseCase.getAllTv(sort).asLiveData()
}