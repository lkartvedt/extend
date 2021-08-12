package com.example.extend.data.databases.Stretches

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.extend.data.Stretch

private const val DATABASE_NAME = "stretch-database"

@Database(entities = [ Stretch::class ], version = 1)
@TypeConverters(StretchTypeConverters::class)

abstract class StretchDatabase : RoomDatabase() {

    companion object {
        private var instance: StretchDatabase? = null

        fun getInstance(context: Context): StretchDatabase {
            return instance ?: let {
                instance ?: Room.databaseBuilder(context, StretchDatabase::class.java, DATABASE_NAME)
                    .build()
            }
        }
    }

    abstract fun stretchDao(): StretchDao
}