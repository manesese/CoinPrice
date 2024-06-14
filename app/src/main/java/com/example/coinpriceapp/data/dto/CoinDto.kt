package com.example.coinpriceapp.data.dto

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

object CoinDto {
    @Serializable
    data class GetCoinBody(
        val status: String,
        val data: CoinData
    )

    @Serializable
    data class CoinData(
        val BTC: CoinInfo,
        val ETH: CoinInfo,
        val ETC: CoinInfo,
        val XRP: CoinInfo,
        val BCH: CoinInfo,
        val QTUM: CoinInfo,
        val BTG: CoinInfo,
        val EOS: CoinInfo,
        val ICX: CoinInfo,
        val TRX: CoinInfo,
        val ELF: CoinInfo,
        val KNC: CoinInfo,
        val GLM: CoinInfo,
        val ZIL: CoinInfo,
        val WAXP: CoinInfo,
        val POWR: CoinInfo,
        val LRC: CoinInfo,
        val STEEM: CoinInfo,
        val ZRX: CoinInfo,
        val SNT: CoinInfo,
        val ADA: CoinInfo,
        val CTXC: CoinInfo,
        val BAT: CoinInfo,
        val THETA: CoinInfo,
        val LOOM: CoinInfo,
        val CVC: CoinInfo,
        val WAVES: CoinInfo,
        val LINK: CoinInfo,
        val ENJ: CoinInfo,
        val VET: CoinInfo,
        val MTL: CoinInfo,
        val IOST: CoinInfo,
        val AMO: CoinInfo,
        @SerialName("date") val date: String? = null
    ){
        fun toList(): List<CoinInfo> {
            return listOf(
                BTC,
                ETH,
                ETC,
                XRP,
                BCH,
                QTUM,
                BTG,
                EOS,
                ICX,
                TRX,
                ELF,
                KNC,
                GLM,
                ZIL,
                WAXP,
                POWR,
                LRC,
                STEEM,
                ZRX,
                SNT,
                ADA,
                CTXC,
                BAT,
                THETA,
                LOOM,
                CVC,
                WAVES,
                LINK,
                ENJ,
                VET,
                MTL,
                IOST,
                AMO
            )
        }
    }

    @Serializable
    data class CoinInfo(
        val opening_price: String,
        val closing_price: String,
        val min_price: String,
        val max_price: String,
        val units_traded: String,
        val acc_trade_value: String,
        val prev_closing_price: String,
        val units_traded_24H: String,
        val acc_trade_value_24H: String,
        val fluctate_24H: String,
        val fluctate_rate_24H: String
    )
}
