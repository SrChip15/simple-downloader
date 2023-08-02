package com.example.simpledownloader

import android.app.Application
import timber.log.Timber

class SimpleDownloaderApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}