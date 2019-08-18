import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MyFilterTest {
    val emptyIntList: List<Int> = emptyList()
    val lessThanFive = { x: Int -> x < 5 }
    val isEven = { x: Int -> x % 2 == 0 }

    @Test
    fun `empty list`() {
        assertEquals(emptyIntList, emptyIntList.myFilter(lessThanFive))
    }

    @Test
    fun `list of one Int which passes the filter`() {
        val list = listOf(1)
        assertEquals(list, list.myFilter(lessThanFive))
    }

    @Test
    fun `list of one Int which doesn't pass the filter`() {
        val list = listOf(10)
        assertEquals(emptyIntList, list.myFilter(lessThanFive))
    }

    @Test
    fun `list of Ints with two elements where one passes`() {
        val list = listOf(0, 1)
        assertEquals(listOf(0), list.myFilter(isEven))
    }

    @Test
    fun `list of Ints where some elements pass the filter`() {
        val list = listOf(1, 10, 2)
        assertEquals(listOf(1, 2), list.myFilter(lessThanFive))
    }

    @Test
    fun `another list of Ints where some pass the filter`() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 45, 46, 47, 48)
        assertEquals(listOf(2, 4, 6, 8, 46, 48), list.myFilter(isEven))
    }

    @Test
    fun `a list of strings`() {
        val list = listOf("red", "orange", "yellow", "green", "blue", "indigo", "violet")
        val moreThanFourLetters = { s: String -> s.length > 4 }
        assertEquals(listOf("orange", "yellow", "green", "indigo", "violet"), list.myFilter(moreThanFourLetters))
    }

    @Test
    fun `a list of lists`() {
        val list = listOf(
            listOf(1, 2, 3),
            listOf(1, 2, 3, 4, 5),
            listOf(1, 2, 3, 4, 5, 6, 7)
        )
        val lengthEqualsFive = { l: List<Int> -> l.size == 5 }
        assertEquals(listOf(listOf(1, 2, 3, 4, 5)), list.myFilter(lengthEqualsFive))
    }
}
