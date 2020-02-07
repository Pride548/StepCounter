package strathclyde.emb15144.stepcounter.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName = "days_table")
data class Day(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    var date: Long = 0L,
    var steps: Int = 0,
    var goal_id: Long = 0L,
    var goal_name: String = "",
    var goal_steps: Int = 0
)