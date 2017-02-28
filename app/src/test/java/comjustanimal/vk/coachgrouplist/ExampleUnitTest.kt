package comjustanimal.vk.coachgrouplist

import org.junit.Test

import comjustanimal.vk.coachgrouplist.model.Group
import comjustanimal.vk.coachgrouplist.model.Person

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).

 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    //Person data tests
    @Test
    @Throws(Exception::class)
    fun createAndReadFirstNameFromPerson() {
        var testPersonWithoutMiddle: Person = Person("First_No_Middle", "Last_No_Middle")
        assertEquals(testPersonWithoutMiddle.firstName, "First_No_Middle")
        var testPersonWithMiddle: Person = Person("First_With_Middle", "Last_With_Middle", "Middle")
        assertEquals(testPersonWithMiddle.firstName, "First_With_Middle")
    }

    @Test
    @Throws(Exception::class)
    fun createAndReadSecondNameFromPerson() {
        var testPersonWithoutMiddle: Person = Person("First_No_Middle", "Last_No_Middle")
        assertEquals(testPersonWithoutMiddle.secondName, null)
        var testPersonWithMiddle: Person = Person("First_With_Middle", "Last_With_Middle", "Middle")
        assertEquals(testPersonWithMiddle.secondName, "Middle")
    }

    @Test
    @Throws(Exception::class)
    fun createAndReadLastNameFromPerson() {
        var testPersonWithoutMiddle: Person = Person("First_No_Middle", "Last_No_Middle")
        assertEquals(testPersonWithoutMiddle.lastName, "Last_No_Middle")
        var testPersonWithMiddle: Person = Person("First_With_Middle", "Last_With_Middle", "Middle")
        assertEquals(testPersonWithMiddle.lastName, "Last_With_Middle")
    }

    //Group data tests
    @Test
    @Throws(Exception::class)
    fun canAddAndReadPersonFromGroup() {
        var testGroup: Group = Group("Test")
        testGroup.personList.add(Person("First", "Last"))
        assertEquals(testGroup.personList.get(0).firstName, "First")

    }

    @Test
    @Throws(Exception::class)
    fun createAndReadNameFromGroup() {
        var testGroup: Group = Group("Test")
        assertEquals(testGroup.groupName, "Test")

    }
}