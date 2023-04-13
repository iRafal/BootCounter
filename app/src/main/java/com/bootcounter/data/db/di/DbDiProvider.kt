package com.bootcounter.data.db.di

import android.content.Context
import com.bootcounter.data.db.AppDb
import com.bootcounter.data.db.deviceBoot.DeviceBootDao

object DbDiProvider {
    fun dataBase(appContext: Context): AppDb = AppDb.getInstance(appContext)
    fun movieDao(database: AppDb): DeviceBootDao = database.deviceBootDao()
}