import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class IntegrationTest() {
    @Test
    fun `example with integers`() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        assertEquals(listOf(2, 4), list.myFilter(numberIsEvenAndLessThan(5)))
    }
}
