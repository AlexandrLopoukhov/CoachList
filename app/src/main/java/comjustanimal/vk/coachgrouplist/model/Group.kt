package comjustanimal.vk.coachgrouplist.model

import android.util.Log
import comjustanimal.vk.coachgrouplist.service.PersonServant
import java.util.*

/**
 * Created by admin on 2/28/2017.
 */
data class Group(var groupName: String, val personList: PersonServant = PersonServant()){
    init {
        Log.d(this.javaClass.name, "Created group " + groupName)
    }
}