package com.example.coinpriceapp.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coinpriceapp.data.dto.CoinDto
import com.example.coinpriceapp.data.model.CoinModel
import com.example.coinpriceapp.data.repositoryModule.repositoryImpl.CoinRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val coinRepositoryImpl: CoinRepositoryImpl) :

    ViewModel() {

        var currentCoinData= listOf<CoinDto.CoinInfo>()
    fun requestCurrentCoinList(
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            coinRepositoryImpl.requestCurrentCoinList().let {
                if (it.isSuccessful) {
                    it.body()?.let { item ->
                        currentCoinData = item.data.toList()
                        currentCoinData.forEach {
                            Timber.e( "it : $it")
                        }
                    }
                    Timber.e("성공")
                } else {
                    Timber.e("실패")
                }
            }
        }
    }
}