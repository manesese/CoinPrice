package com.example.coinpriceapp.viewModel

import androidx.lifecycle.ViewModel
import com.example.coinpriceapp.data.repositoryModule.repositoryImpl.CoinRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val coinRepositoryImpl: CoinRepositoryImpl) : ViewModel() {

    fun test() {
        Timber.e("ViewModel Test")
    }
}