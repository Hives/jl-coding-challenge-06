import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class IntegrationTest() {
    @Test
    fun `example with integers and recursive filter`() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        assertEquals(listOf(2, 4), list.myRecursiveFilter(numberIsEvenAndLessThan(5)))
    }

    @Test
    fun `example with integers and looping filter`() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        assertEquals(listOf(2, 4), list.myLoopingFilter(numberIsEvenAndLessThan(5)))
    }

    @Test
    fun `example with integers and folding filter`() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        assertEquals(listOf(2, 4), list.myFoldingFilter(numberIsEvenAndLessThan(5)))
    }

    @Test
    fun `example with integers and tail recursive filter`() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        assertEquals(listOf(2, 4), list.myTailRecursiveFilter(numberIsEvenAndLessThan(5)))
    }

}
