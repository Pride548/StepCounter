package strathclyde.emb15144.stepcounter.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface DayDao {
    @Insert
    fun insert(day: Day)
    @Update
    fun update(day: Day)
    @Query("SELECT * FROM days_table WHERE id = :key")
    fun get(key: Long): Day?
    @Query("SELECT * FROM days_table")
    fun getAll(): LiveData<List<Day>>
}
