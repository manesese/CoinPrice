package com.example.coinpriceapp.data.repositoryModule.repositoryImpl

import com.example.coinpriceapp.data.dto.CoinDto
import com.example.coinpriceapp.data.network.CoinApi
import com.example.coinpriceapp.data.repositoryModule.repository.CoinRepository
import retrofit2.Response
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val apiService: CoinApi) : CoinRepository {

    override suspend fun requestCurrentCoinList(
    ): Response<CoinDto.GetCoinBody> {
        return apiService.requestCurrentCoinList()
    }

}