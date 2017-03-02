package comjustanimal.vk.coachgrouplist.adapter

import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import comjustanimal.vk.coachgrouplist.AddPersonActivity
import comjustanimal.vk.coachgrouplist.R.id.group_item_name_textView
import comjustanimal.vk.coachgrouplist.R.id.group_item_number_of_members_textView
import comjustanimal.vk.coachgrouplist.R.layout.group_item
import comjustanimal.vk.coachgrouplist.model.Group
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.find
import org.jetbrains.anko.startActivity
import java.util.*


/**
 * Created by admin on 2/28/2017.
 */
class ListOfGroupsAdapter(containerList: ArrayList<Group>) : RecyclerView.Adapter<ListOfGroupsAdapter.ViewHolder>() {
    var mContainerList: ArrayList<Group> = containerList

    override fun getItemCount(): Int {
        return mContainerList.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.groupItemNameTextView!!.setText(mContainerList.get(position).groupName)
        holder!!.groupItemNumberOfMembers!!.setText(mContainerList.get(position).personList.containerList.size.toString())


    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListOfGroupsAdapter.ViewHolder {
        var v: View = LayoutInflater.from(parent!!.context).inflate(group_item, parent, false)
        var vh: ListOfGroupsAdapter.ViewHolder = ViewHolder(v, (object : ListOfGroupsAdapter.ListItemClickListener {
            override fun onListItemClick(clickedItemIndex: Int) {
                parent.context.startActivity<AddPersonActivity>()
            }
        }))
        return vh
    }

    inner class ViewHolder(itemView: View?, listener: ListItemClickListener) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val mListener: ListItemClickListener = listener
        val groupItemNameTextView: TextView = itemView!!.find(group_item_name_textView)
        val groupItemNumberOfMembers: TextView = itemView!!.find(group_item_number_of_members_textView)

        init {
            groupItemNumberOfMembers.setOnClickListener(this)
            groupItemNameTextView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            var clickedItemPosition: Int = adapterPosition
            mListener.onListItemClick(clickedItemPosition)
        }


    }


    interface ListItemClickListener {
        fun onListItemClick(clickedItemIndex: Int)
    }

}
