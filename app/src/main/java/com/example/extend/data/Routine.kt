package com.example.extend.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.*

@Entity
data class Routine(
    val name: String = "",
    //val stretches: ArrayList<Stretch> = ArrayList(),
    @PrimaryKey var id: UUID = UUID.randomUUID()) : Serializable

