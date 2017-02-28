package comjustanimal.vk.coachgrouplist

import org.junit.Test

import comjustanimal.vk.coachgrouplist.model.Group
import comjustanimal.vk.coachgrouplist.model.Person
import comjustanimal.vk.coachgrouplist.service.GroupServant

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).

 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    var testGroup: Group? = null
    var testPersonWithoutMiddle: Person? = null
    var testPersonWithMiddle: Person? = null

    @Before
    fun initialize(){
        GroupServant.containerList.removeAll{flag -> true}
        testGroup = Group("Test")
        testPersonWithoutMiddle = Person("First_No_Middle", "Last_No_Middle")
        testPersonWithMiddle = Person("First_With_Middle", "Last_With_Middle", "Middle")
    }

    //Person data tests
    @Test
    @Throws(Exception::class)
    fun readFirstNameFromPerson() {
        assertEquals(testPersonWithoutMiddle!!.firstName, "First_No_Middle")
        assertEquals(testPersonWithMiddle!!.firstName, "First_With_Middle")
    }

    @Test
    @Throws(Exception::class)
    fun readSecondNameFromPerson() {
        assertEquals(testPersonWithoutMiddle!!.secondName, null)
        assertEquals(testPersonWithMiddle!!.secondName, "Middle")
    }

    @Test
    @Throws(Exception::class)
    fun readLastNameFromPerson() {
        assertEquals(testPersonWithoutMiddle!!.lastName, "Last_No_Middle")
        assertEquals(testPersonWithMiddle!!.lastName, "Last_With_Middle")
    }

    //Group data tests
    @Test
    @Throws(Exception::class)
    fun readPersonFromGroup() {
        testGroup!!.personList.add(Person("First", "Last"))
        assertEquals(testGroup!!.personList.size, 1)
        assertEquals(testGroup!!.personList.get(0).firstName, "First")

    }

    @Test
    @Throws(Exception::class)
    fun readNameFromGroup() {
        assertEquals(testGroup!!.groupName, "Test")
    }

    //GroupServant tests
    @Test
    @Throws(Exception::class)
    fun addGroup() {
        GroupServant.containerList.add(testGroup!!)
        assertEquals(GroupServant.containerList.size, 1)
        assertEquals(GroupServant.containerList.get(0).groupName, "Test")
    }

    @Test
    @Throws(Exception::class)
    fun deleteGroup() {
        GroupServant.containerList.add(testGroup!!)
        assertEquals(GroupServant.containerList.size, 1)
        GroupServant.containerList.removeIf { x -> x.groupName.equals("Test") }
        assertEquals(GroupServant.containerList.size, 0)

    }
}