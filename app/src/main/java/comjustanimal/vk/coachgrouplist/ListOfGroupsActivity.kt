package comjustanimal.vk.coachgrouplist

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import comjustanimal.vk.coachgrouplist.R.layout.activity_list_of_groups
import comjustanimal.vk.coachgrouplist.adapter.ListOfGroupsAdapter
import comjustanimal.vk.coachgrouplist.service.GroupServant
import kotlinx.android.synthetic.main.activity_list_of_groups.*
import kotlinx.android.synthetic.main.content_list_of_groups.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toolbar

class ListOfGroupsActivity : AppCompatActivity(), ListOfGroupsAdapter.ListItemClickListener {
    override fun onListItemClick(clickedItemIndex: Int) {
        //startActivity<AddPersonActivity>()
        Toast.makeText(this, "Clicked item " + clickedItemIndex, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_list_of_groups)
        setSupportActionBar(toolbar)

        with(list_of_groups_recycler_view){
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this.context)
            adapter = ListOfGroupsAdapter(GroupServant.containerList)
        }

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener {
            Log.d(this.javaClass.name, "Will be switched to add group screen")
            startActivity<AddGroupActivity>()
            Log.d(this.javaClass.name, "Switched")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_list_of_groups, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }
}
