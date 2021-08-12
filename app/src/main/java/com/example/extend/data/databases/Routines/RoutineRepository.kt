package com.example.extend.data.databases.Routines

import android.content.Context
import android.os.AsyncTask
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import java.util.concurrent.Executors
import java.util.*
import com.example.extend.data.Routine

class RoutineRepository private constructor(private val routineDao: RoutineDao) {
    private val logTag = "Routine Repository"

    companion object {
        private var instance: RoutineRepository? = null

        fun getInstance(context: Context): RoutineRepository? {
            return instance ?: let {
                if (instance == null) {
                    val database = RoutineDatabase.getInstance(context)
                    instance = RoutineRepository(database.routineDao())
                }
                return instance
            }
        }
    }
}