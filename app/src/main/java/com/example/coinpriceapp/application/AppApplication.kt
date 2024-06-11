package com.example.coinpriceapp.application

import android.app.Application
import timber.log.Timber

class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        //Timber 세팅
        Timber.plant(Timber.DebugTree())
    }
}