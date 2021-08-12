package com.example.extend.data.databases.Stretches

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import java.util.*
import com.example.extend.data.Stretch

@Dao
interface StretchDao {

    @Insert
    fun createNewStretch(stretch: Stretch)

    @Delete
    fun deleteStretch(stretch: Stretch)

    @Query("SELECT name FROM Stretch WHERE id=(:id)")
    fun getName(id: UUID): String

    @Query("UPDATE Stretch SET name=(:newName) WHERE id=(:id)")
    fun updateName(id: UUID, newName: String)

    @Query("SELECT time FROM Stretch WHERE id=(:id)")
    fun getTime(id: UUID): Int

    @Query("UPDATE Stretch SET time=(:newTime) WHERE id=(:id)")
    fun updateTime(id: UUID, newTime: Int)

    @Query("SELECT motionDescription FROM Stretch WHERE id=(:id)")
    fun getMotionDescription(id: UUID): String

    @Query("UPDATE Stretch SET motionDescription=(:newMotionDescription) WHERE id=(:id)")
    fun updateMotionDescription(id: UUID, newMotionDescription: String)

    @Query("SELECT muscleName FROM Stretch WHERE id=(:id)")
    fun getMuscleName(id: UUID): String

    @Query("UPDATE Stretch SET muscleName=(:newMuscleName) WHERE id=(:id)")
    fun updateMuscleName(id: UUID, newMuscleName: String)
}