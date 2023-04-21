import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class TestForTask4 {

    @Test
    fun writeNumber() {
        assertTrue(writeNumber(0) == "Ошибка! Неверные входные данные.")
        assertEquals("один", writeNumber(1))
        assertEquals("два", writeNumber(2))
        assertEquals("десять", writeNumber(10))
        assertTrue(writeNumber(100) == "сто")
        assertTrue(writeNumber(606) == "шестьсот шесть")
        assertTrue(writeNumber(317) == "триста семнадцать")
        assertFalse("девятьсот семьдесят пять" != writeNumber(975))
        assertFalse("пятьсот сорок" != writeNumber(540))
        assertFalse("девятьсот девяносто девять" != writeNumber(999))
        assertEquals("тысяча", writeNumber(1000))
        assertTrue(writeNumber(1001) == "Ошибка! Неверные входные данные.")
        assertTrue(writeNumber(-6575) == "Ошибка! Неверные входные данные.")
        assertTrue(writeNumber(8888) == "Ошибка! Неверные входные данные.")
    }
}