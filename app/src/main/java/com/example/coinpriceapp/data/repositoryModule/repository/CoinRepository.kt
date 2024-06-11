package com.example.coinpriceapp.data.repositoryModule.repository

import com.example.coinpriceapp.data.dto.CoinDto
import retrofit2.Response

interface CoinRepository {

    suspend fun requestCurrentCoinList(
    ): Response<CoinDto.GetCoinBody>
}