package Entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID

@Entity(tableName = "user")
data class User (
    @PrimaryKey
    val id: UUID = UUID.randomUUID(),
    val nickname: String,
    val money: Int,
    val rating: Int,
    val bestResult: Int,
    val skin: Int,
    val soundLoud: Int
)