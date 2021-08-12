package com.example.extend.data.databases.Stretches

import android.content.Context
import android.os.AsyncTask
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import java.util.concurrent.Executors
import java.util.*
import com.example.extend.data.Stretch

class StretchRepository private constructor(private val stretchDao: StretchDao) {
    private val logTag = "Stretch Repository"

    companion object {
        private var instance: StretchRepository? = null

        fun getInstance(context: Context): StretchRepository? {
            return instance ?: let {
                if (instance == null) {
                    val database = StretchDatabase.getInstance(context)
                    instance = StretchRepository(database.stretchDao())
                }
                return instance
            }
        }
    }
}