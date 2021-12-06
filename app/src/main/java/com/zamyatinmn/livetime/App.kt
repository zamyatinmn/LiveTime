package com.zamyatinmn.livetime

import android.app.Application
import org.koin.core.context.startKoin


class App: Application() {
    companion object {
        lateinit var instance: App
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        startKoin {
            modules(
                KoinDi.ciceroneModule
            )
        }
    }
}