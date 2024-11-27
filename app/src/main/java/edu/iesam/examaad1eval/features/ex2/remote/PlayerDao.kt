package edu.iesam.examaad1eval.features.ex2.remote

import androidx.room.Dao
import androidx.room.Query
import edu.iesam.examaad1eval.features.ex2.Player

@Dao
interface PlayerDao {

    @Query("SELECT * FROM player")
    fun getPlayers(): List<Player>
}