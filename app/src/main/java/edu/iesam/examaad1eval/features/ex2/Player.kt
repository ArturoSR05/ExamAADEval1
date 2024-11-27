package edu.iesam.examaad1eval.features.ex2

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Player (
    @PrimaryKey val id: String,
    @ColumnInfo(name = "name") val name: String
)