import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class NumberIsEvenAndLessThanTest() {
    @Test
    fun `parameter is 0`() {
        val filter = numberIsEvenAndLessThan(3)
        assertFalse(filter(4))
        assertFalse(filter(3))
        assertTrue(filter(2))
        assertFalse(filter(1))
    }
}
