package Entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "skin")
data class Skin (
    @PrimaryKey
    val id: Int
)