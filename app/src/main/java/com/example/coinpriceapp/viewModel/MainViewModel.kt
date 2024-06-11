package com.example.coinpriceapp.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coinpriceapp.data.repositoryModule.repositoryImpl.CoinRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val coinRepositoryImpl: CoinRepositoryImpl) : ViewModel() {

  fun requestCurrentCoinList(
  ) {
      viewModelScope.launch(Dispatchers.IO) {
          Timber.e("입장")
          coinRepositoryImpl.requestCurrentCoinList().let {
              if(it.isSuccessful) {
                  Timber.e("성공")
                  Timber.e("data: ${it.body()?.data}")
                  Timber.e("status: ${it.body()?.status}")
                  Timber.e("status: ${it.body()?.data?.BTC?.dateString}")
                  Timber.e("성공")
              }else {
                  Timber.e("실패")
              }
          }
      }
  }
}