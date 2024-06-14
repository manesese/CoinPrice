package com.example.coinpriceapp.data.model

import androidx.lifecycle.MutableLiveData
import com.example.coinpriceapp.data.dto.CoinDto
import com.example.coinpriceapp.data.dto.CoinDto.CoinData

object CoinModel {
    var BASE_URL = "https://api.bithumb.com/"
    var coinName = ""//Api로 가져온 코인들의 이름들을 담는 곳
    var coinInfoList = mutableListOf<CoinDto.CoinInfo>()
}