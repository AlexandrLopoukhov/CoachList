package comjustanimal.vk.coachgrouplist.model

import android.util.Log

/**
 * Created by admin on 2/28/2017.
 */
data class Person(var firstName: String, var lastName: String, var secondName: String? = null){
    init {
        Log.d(this.javaClass.name, "Created person " + firstName + " " + secondName + " " + lastName)
    }
}