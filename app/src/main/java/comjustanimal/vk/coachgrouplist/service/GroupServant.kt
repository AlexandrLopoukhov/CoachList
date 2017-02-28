package comjustanimal.vk.coachgrouplist.service

import comjustanimal.vk.coachgrouplist.model.Group
import java.util.*

/**
 * Created by admin on 2/28/2017.
 */
object GroupServant: Servant {
    override val containerList: ArrayList<Group> = ArrayList<Group>()

    override fun getAll(): List<Any> {
        return containerList
    }

    override fun edit() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun delete(what: Any) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isContains(what: Any): Boolean {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}