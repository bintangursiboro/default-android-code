package com.ijniclohot.ijniclegacy

import android.app.Application
import com.ijniclohot.ijniclegacy.LegacyCode.KoinModules.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(appModule)
        }
        super.onCreate()
    }
}