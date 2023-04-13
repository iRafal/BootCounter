package com.bootcounter.data.db.deviceBoot

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.bootcounter.data.db.deviceBoot.DeviceBootEntity.Companion.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class DeviceBootEntity(
    @PrimaryKey @ColumnInfo(name = COLUMN_ID) val id: Int? = null,
    @ColumnInfo(name = COLUMN_TIMESTAMP) val timestamp: String? = null,  @ColumnInfo(
        name = COLUMN_IS_CHECKED,
        defaultValue = "0"
    ) val isChecked: Boolean = false,
) {
    companion object {
        const val TABLE_NAME = "device_boot"
        const val COLUMN_ID = "id"
        const val COLUMN_TIMESTAMP = "id"
        const val COLUMN_IS_CHECKED = "is_checked"
    }
}