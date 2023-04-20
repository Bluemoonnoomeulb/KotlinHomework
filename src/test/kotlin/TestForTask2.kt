import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import java.time.LocalDate
import kotlin.test.assertFailsWith

internal class TestForTask2 {

    @Test
    fun makeConversion() {
        assertEquals("Я получил String = Привет, Тинькофф, ее длина равна 16",
            makeConversion("Привет, Тинькофф"), "Error for object of type String!")
        assertEquals("Я получил Int = 25, его квадрат равен 625", makeConversion(25),
            "Error for object of type Int!")
        assertFailsWith<ArithmeticException> { makeConversion(46341) }
        assertEquals("Я получил Double = 13.31315, это число округляется до 13.31",
            makeConversion(13.31315), "Error for object of type Double!")
        assertEquals("Я получил Double = 531.995, это число округляется до 532",
            makeConversion(531.995), "Error for object of type Double!")
        assertTrue(makeConversion(LocalDate.of(2002,1,20))
                == "Я получил LocalDate = 2002-01-20, она меньше даты основания Tinkoff",
            "Error for object of type LocalDate!")
        assertTrue(makeConversion(LocalDate.of(2006,12,24))
                == "Я получил LocalDate = 2006-12-24, она не меньше даты основания Tinkoff",
            "Error for object of type LocalDate!")
        assertTrue(makeConversion(LocalDate.of(2023,4,20))
                == "Я получил LocalDate = 2023-04-20, она не меньше даты основания Tinkoff",
            "Error for object of type LocalDate!")
        assertFalse(makeConversion(null) != "Объект равен null", "Error for null object!")
        assertFalse(makeConversion(0.7f) != "Мне этот тип неизвестен(", "Error for raw class!")
    }
}