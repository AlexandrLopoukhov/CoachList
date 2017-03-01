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

import comjustanimal.vk.coachgrouplist.R.id.group_item_name_textView
import comjustanimal.vk.coachgrouplist.R.id.group_item_number_of_members_textView
import comjustanimal.vk.coachgrouplist.R.layout.group_item
import comjustanimal.vk.coachgrouplist.model.Group
import java.util.*
import org.jetbrains.anko.*


/**
 * Created by admin on 2/28/2017.
 */
class ListOfGroupsAdapter(containerList: ArrayList<Group>) : RecyclerView.Adapter<ListOfGroupsAdapter.ViewHolder>(), AnkoLogger {
    var mContainerList: ArrayList<Group> = containerList
    override fun getItemCount(): Int {
        return mContainerList.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.groupItemNameTextView!!.setText(mContainerList.get(position).groupName)
        holder!!.groupItemNumberOfMembers!!.setText(mContainerList.get(position).personList.containerList.size.toString())
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent!!.context).inflate(group_item, parent, false))
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val groupItemNameTextView: TextView = itemView!!.find(group_item_name_textView)
        val groupItemNumberOfMembers: TextView = itemView!!.find(group_item_number_of_members_textView)
    }


}