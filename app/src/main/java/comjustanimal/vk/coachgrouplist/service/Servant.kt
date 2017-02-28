package comjustanimal.vk.coachgrouplist.service

/**
 * Created by admin on 2/28/2017.
 */
interface Servant {
    val containerList: List<Any>;

    fun getAll(): List<Any>
    fun edit()
    fun add(placeholder: Any)
    fun isContain(what: Any): Boolean


}