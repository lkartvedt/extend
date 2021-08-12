package com.example.extend.data.databases.Routines

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.extend.data.Routine

private const val DATABASE_NAME = "routine-database"

@Database(entities = [ Routine::class ], version = 1)
@TypeConverters(RoutineTypeConverters::class)

abstract class RoutineDatabase : RoomDatabase() {

    companion object {
        private var instance: RoutineDatabase? = null

        fun getInstance(context: Context): RoutineDatabase {
            return instance ?: let {
                instance ?: Room.databaseBuilder(context, RoutineDatabase::class.java, DATABASE_NAME)
                    .build()
            }
        }
    }

    abstract fun routineDao(): RoutineDao
}