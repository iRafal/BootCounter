package com.bootcounter.app

import android.app.Application
import com.bootcounter.data.db.AppDb
import com.bootcounter.data.db.deviceBoot.DeviceBootDao
import com.bootcounter.data.db.di.DbDiProvider
import com.bootcounter.data.deviceBoot.dataSource.local.DeviceBootLocalDataSource
import com.bootcounter.data.deviceBoot.di.DeviceBootDiProvider
import com.bootcounter.data.deviceBoot.di.DeviceBootDiProvider.deviceBootRepository
import com.bootcounter.data.deviceBoot.repository.DeviceBootRepository
import com.bootcounter.domain.deviceBoot.DeviceBootInteractor
import com.bootcounter.domain.di.DomainDiProvider

class AppDi(private val application: Application) {
    val appDb: AppDb by lazy {
        DbDiProvider.dataBase(application)
    }

    val deviceBootDao: DeviceBootDao by lazy {
        appDb.deviceBootDao()
    }

    val deviceBootLocalDataSource: DeviceBootLocalDataSource by lazy {
        DeviceBootDiProvider.deviceBootLocalDataSource(deviceBootDao)
    }

    val deviceBootRepository: DeviceBootRepository by lazy {
        DeviceBootDiProvider.deviceBootRepository(deviceBootLocalDataSource)
    }

    val deviceBootInteractor: DeviceBootInteractor by lazy {
        DomainDiProvider.deviceBootInteractor(deviceBootRepository)
    }
}