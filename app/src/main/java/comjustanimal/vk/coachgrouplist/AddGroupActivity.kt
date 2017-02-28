package comjustanimal.vk.coachgrouplist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import comjustanimal.vk.coachgrouplist.model.Group
import comjustanimal.vk.coachgrouplist.service.GroupServant
import kotlinx.android.synthetic.main.activity_add_group.*
import org.jetbrains.anko.startActivity

class AddGroupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_group)
        add_group_button.setOnClickListener {
            GroupServant.containerList.add(Group(add_group_editText.text.toString()))
            Log.d(javaClass.toString(), "group added")
            startActivity<ListOfGroups>()
        }
    }
}
