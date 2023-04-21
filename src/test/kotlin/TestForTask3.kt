import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.math.roundToInt

internal class TestForTask3 {

    @Test
    fun getSum() {
        assertTrue(getSum(listOf(2.0)) == 4.0, "Even number processing error!")
        assertFalse(getSum(listOf(3.0)) != 1.5, "Odd number processing error!")
        assertFalse(getSum(listOf(6.789)) != 0.0, "Filtering ( > 25) error!")
        assertTrue(getSum(listOf(null, 1.0)) == 0.5, "Filtering (by null) error!")
        assertEquals(0.0, (getSum(listOf()) * 100).roundToInt() / 100.0, "Empty input error!")
        assertEquals(8.5, (getSum(listOf(null, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, null, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0)) * 100).roundToInt() / 100.0)
        assertEquals(22.09, (getSum(listOf(13.31, 3.98, 12.0, 2.99, 9.0)) * 100).roundToInt() / 100.0)
    }
}