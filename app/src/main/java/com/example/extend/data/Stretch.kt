package com.example.extend.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.*

@Entity
data class Stretch (
    val name: String = "",
    val time: Int = 0,
    val motionDescription: String = "",
    val muscleName: String = "",
    @PrimaryKey var id: UUID = UUID.randomUUID()) : Serializable
