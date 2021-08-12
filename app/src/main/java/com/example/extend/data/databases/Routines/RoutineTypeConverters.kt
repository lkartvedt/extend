package com.example.extend.data.databases.Routines

import androidx.room.TypeConverter
import java.util.*

class RoutineTypeConverters {

    @TypeConverter
    fun fromUUID(uuid: UUID?): String? {
        return uuid?.toString()
    }

    @TypeConverter
    fun toUUID(uuid: String?): UUID? {
        return UUID.fromString(uuid)
    }
}