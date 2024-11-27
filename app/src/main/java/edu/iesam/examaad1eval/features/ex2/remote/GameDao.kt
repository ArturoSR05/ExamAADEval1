package edu.iesam.examaad1eval.features.ex2.remote

import androidx.room.Dao
import androidx.room.Query
import edu.iesam.examaad1eval.features.ex2.Game


@Dao
interface GameDao {

    @Query("SELECT * FROM game")
    fun getGames(): List<Game>

}