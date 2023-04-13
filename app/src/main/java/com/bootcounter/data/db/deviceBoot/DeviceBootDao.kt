package com.bootcounter.data.db.deviceBoot

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

private const val tableName = DeviceBootEntity.TABLE_NAME

@Dao
interface DeviceBootDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrReplace(data: DeviceBootEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrReplace(data: List<DeviceBootEntity>)

    @Query("SELECT * FROM $tableName")
    suspend fun getAll(): List<DeviceBootEntity>

    @Query("SELECT * FROM $tableName")
    fun observeAll(): Flow<List<DeviceBootEntity>>

    @Delete
    suspend fun delete(data: DeviceBootEntity): Int

    @Query("DELETE FROM $tableName")
    suspend fun delete(): Int
}