package com.example.coinpriceapp.data.network

import com.example.coinpriceapp.data.dto.CoinDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinApi {

    @GET("public/ticker/ALL_KRW")
    suspend fun requestCurrentCoinList(): Response<CoinDto.GetCoinBody>
}