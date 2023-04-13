package com.bootcounter.data.deviceBoot.di

import com.bootcounter.data.db.deviceBoot.DeviceBootDao
import com.bootcounter.data.deviceBoot.dataSource.local.DeviceBootLocalDataSource
import com.bootcounter.data.deviceBoot.dataSource.local.DeviceBootLocalDataSourceImpl
import com.bootcounter.data.deviceBoot.repository.DeviceBootRepository
import com.bootcounter.data.deviceBoot.repository.DeviceBootRepositoryImpl

object DeviceBootDiProvider {
    fun deviceBootRepository(
        deviceBootLocalDataSource: DeviceBootLocalDataSource
    ): DeviceBootRepository = DeviceBootRepositoryImpl(deviceBootLocalDataSource)

    fun deviceBootLocalDataSource(
        deviceBootDao: DeviceBootDao
    ): DeviceBootLocalDataSource = DeviceBootLocalDataSourceImpl(deviceBootDao)
}