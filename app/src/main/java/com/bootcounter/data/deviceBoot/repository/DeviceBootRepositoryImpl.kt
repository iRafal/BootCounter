package com.bootcounter.data.deviceBoot.repository

import com.bootcounter.data.deviceBoot.dataSource.local.DeviceBootLocalDataSource

class DeviceBootRepositoryImpl(
    private val deviceBootLocalDataSource: DeviceBootLocalDataSource
) : DeviceBootRepository {
}