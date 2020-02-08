package strathclyde.emb15144.stepcounter.ui.goals

import strathclyde.emb15144.stepcounter.database.Goal

class GoalListListener(
    val onDeleteCallback: (goal: Goal) -> Unit,
    val onEditCallback: (goal: Goal) -> Unit
) {
    fun onDelete(goal: Goal) : Unit = onDeleteCallback(goal)
    fun onEdit(goal: Goal) : Unit = onEditCallback(goal)
}
