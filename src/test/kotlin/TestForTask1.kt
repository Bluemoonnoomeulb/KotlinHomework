import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertFailsWith

internal class TestForTask1 {

    @Test
    fun power() {
        var mutableList = mutableListOf(0, 1, 5, -8, 144, -30, 2356)
        mutableList.power()
        assertEquals(mutableList, mutableListOf(0, 1, 25, 64, 20736, 900, 5550736))

        mutableList = mutableListOf(131, -12, 31, 17, 85, 132421, 0, 5)
        assertFailsWith<ArithmeticException> { mutableList.power() }
    }
}