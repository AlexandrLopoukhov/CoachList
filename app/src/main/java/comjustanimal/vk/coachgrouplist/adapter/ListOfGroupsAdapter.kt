package comjustanimal.vk.coachgrouplist.adapter

import android.support.annotation.LayoutRes
import android.support.v7.appcompat.R.styleable.View
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import comjustanimal.vk.coachgrouplist.R
import comjustanimal.vk.coachgrouplist.R.id.group_item_textView
import comjustanimal.vk.coachgrouplist.R.layout.group_item
import comjustanimal.vk.coachgrouplist.model.Group
import java.util.*
import org.jetbrains.anko.*
import comjustanimal.vk.coachgrouplist.utils.Layout

/**
 * Created by admin on 2/28/2017.
 */
class ListOfGroupsAdapter(containerList: ArrayList<Group>) : RecyclerView.Adapter<ListOfGroupsAdapter.ViewHolder>() {
    var mContainerList: ArrayList<Group> = containerList
    override fun getItemCount(): Int {
        return mContainerList.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.groupItemTextView?.setText(mContainerList.get(position).groupName)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent!!.context).inflate(group_item, parent, false))
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val groupItemTextView: TextView = itemView!!.find(group_item_textView)
    }


}