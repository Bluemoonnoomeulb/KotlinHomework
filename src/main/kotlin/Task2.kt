import java.time.LocalDate
import kotlin.math.roundToInt
import java.lang.Math.toIntExact

/*  Method determines class membership
    Return formatted string
    If Int overflows, an exception is thrown */
fun makeConversion(anyObject: Any?) : String {
    var resultString : String

    when (anyObject) {
        is String -> resultString = "Я получил String = $anyObject, ее длина равна ${anyObject.length}"

        is Int -> {
            try {
                toIntExact(anyObject*anyObject.toLong())
            } catch (e: ArithmeticException) {
                throw ArithmeticException("Int overflow has been prevented for value to the power of 2: $anyObject")
            }
            resultString = "Я получил Int = $anyObject, его квадрат равен ${anyObject*anyObject}"
        }

        is Double -> {
            val resultDouble = (((anyObject * 1000.0).roundToInt() / 1000.0) * 100.0).roundToInt() / 100.0
            var answerRepresentation = resultDouble.toString()

            if (resultDouble * 100 % 100 == 0.0)
                answerRepresentation = resultDouble.toInt().toString()

            resultString = "Я получил Double = $anyObject, это число округляется до $answerRepresentation"
        }

        is LocalDate -> {
            val tinkoffBirth = LocalDate.of(2006, 12, 24)
            val compare = anyObject.compareTo(tinkoffBirth)
            var answer = ""

            when {
                compare >= 0 -> answer = "она не меньше даты основания Tinkoff"
                compare < 0 -> answer = "она меньше даты основания Tinkoff"
            }
            resultString = "Я получил LocalDate = $anyObject, $answer"
        }

        null -> resultString = "Объект равен null"
        else -> resultString = "Мне этот тип неизвестен("
    }

    return resultString
}