package com.bootcounter.data.deviceBoot.dataSource.local

import com.bootcounter.data.db.deviceBoot.DeviceBootDao

class DeviceBootLocalDataSourceImpl(
    private val deviceBootsDao: DeviceBootDao
) : DeviceBootLocalDataSource {
}