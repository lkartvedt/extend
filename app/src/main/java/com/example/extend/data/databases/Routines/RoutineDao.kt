package com.example.extend.data.databases.Routines

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import java.util.*
import com.example.extend.data.Routine

@Dao
interface RoutineDao {

    @Insert
    fun createNewRoutine(routine: Routine)

    @Delete
    fun deleteRoutine(routine: Routine)

    @Query("SELECT name FROM Routine WHERE id=(:id)")
    fun getName(id: UUID): String

    @Query("UPDATE Routine SET name=(:newName) WHERE id=(:id)")
    fun updateName(id: UUID, newName: String)
}