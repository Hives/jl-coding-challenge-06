import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MyFilterKtTest {
    val emptyList: List<Int> = listOf()
    val lessThanFive = { x: Int -> x < 5 }
    val isEven = { x: Int -> x % 2 == 0 }

    @Test
    fun `empty list`() {
        assertEquals(emptyList, applyFilter(emptyList, lessThanFive))
    }

    @Test
    fun `list of one element which passes the filter`() {
        val list = listOf(1)
        assertEquals(list, applyFilter(list, lessThanFive))
    }

    @Test
    fun `list of one element which doesn't pass the filter`() {
        val list = listOf(10)
        assertEquals(emptyList, applyFilter(list, lessThanFive))
    }

    @Test
    fun `list with two elements where one passes`() {
        val list = listOf(0, 1)
        assertEquals(listOf(0), applyFilter(list, isEven))
    }

    @Test
    fun `list with some elements which pass the filter`() {
        val list = listOf(1, 10, 2)
        assertEquals(listOf(1, 2), applyFilter(list, lessThanFive))
    }

    @Test
    fun `another list with some elements which pass the filter`() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 45, 46, 47, 48)
        assertEquals(listOf(2, 4, 6, 8, 46, 48), applyFilter(list, isEven))
    }
}
