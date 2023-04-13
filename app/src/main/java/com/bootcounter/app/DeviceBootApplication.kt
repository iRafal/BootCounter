package com.bootcounter.app

import android.app.Application

class DeviceBootApplication : Application() {
    lateinit var appDi: AppDi

    override fun onCreate() {
        super.onCreate()
        appDi = AppDi(this)
    }

    companion object {
        private var instance: DeviceBootApplication? = null
        fun getInstance(): DeviceBootApplication = checkNotNull(instance)
    }
}