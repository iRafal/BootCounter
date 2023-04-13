package com.bootcounter.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bootcounter.data.db.deviceBoot.DeviceBootDao
import com.bootcounter.data.db.deviceBoot.DeviceBootEntity

@Database(
    entities = [DeviceBootEntity::class],
    version = 1,
    exportSchema = true
)
abstract class AppDb : RoomDatabase() {

    abstract fun deviceBootDao(): DeviceBootDao

    companion object {
        private const val DB_NAME = "AppDb.db"
        fun getDbBuilder(context: Context, dbName: String): Builder<AppDb> {
            return Room.databaseBuilder(context.applicationContext, AppDb::class.java, dbName)
        }

        fun getInstance(context: Context): AppDb = getDbBuilder(context, DB_NAME).build()
    }
}