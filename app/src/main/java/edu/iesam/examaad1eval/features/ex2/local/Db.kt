package edu.iesam.examaad1eval.features.ex2.local

import androidx.room.Dao
import androidx.room.Database
import androidx.room.RoomDatabase
import edu.iesam.examaad1eval.features.ex1.User
import edu.iesam.examaad1eval.features.ex2.Game
import edu.iesam.examaad1eval.features.ex2.Player
import edu.iesam.examaad1eval.features.ex2.remote.GameDao
import edu.iesam.examaad1eval.features.ex2.remote.PlayerDao

@Database(entities = [Game::class, Player::class], version = 2)

abstract class Ex2DataBase: RoomDatabase(){

    abstract fun gameDao(): GameDao
    abstract fun playerDao(): PlayerDao

}
