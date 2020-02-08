package strathclyde.emb15144.stepcounter.ui.goals

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import strathclyde.emb15144.stepcounter.database.Goal

class GoalsListAdapter(val clickListener: GoalListListener) : ListAdapter<Goal, GoalViewHolder> (GoalListDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoalViewHolder {
        return GoalViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: GoalViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item, clickListener)
    }

}
