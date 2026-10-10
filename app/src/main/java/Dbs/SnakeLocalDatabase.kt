package Dbs

import Entities.Skin
import Entities.User
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Skin::class, User::class],
    version = 1
)

abstract class SnakeLocalDatabase: RoomDatabase() {

}