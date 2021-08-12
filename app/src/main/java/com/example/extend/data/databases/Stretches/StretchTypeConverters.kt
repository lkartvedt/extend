package com.example.extend.data.databases.Stretches

import androidx.room.TypeConverter
import java.util.*

class StretchTypeConverters {

    @TypeConverter
    fun fromUUID(uuid: UUID?): String? {
        return uuid?.toString()
    }

    @TypeConverter
    fun toUUID(uuid: String?): UUID? {
        return UUID.fromString(uuid)
    }
}