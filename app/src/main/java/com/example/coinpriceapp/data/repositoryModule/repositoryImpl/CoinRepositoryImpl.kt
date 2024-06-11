package com.example.coinpriceapp.data.repositoryModule.repositoryImpl

import com.example.coinpriceapp.data.network.CoinApi
import com.example.coinpriceapp.data.repositoryModule.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val apiService: CoinApi):CoinRepository {

}