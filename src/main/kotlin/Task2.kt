import java.time.LocalDate


fun makeConversion(anyObject: Any?) {
    when (anyObject) {
        is String -> println("Я получил String = $anyObject, ее длина равна ${anyObject.length}")
        is Int -> println("Я получил Int = $anyObject, его квадрат равен ${anyObject*anyObject}")
        is Double -> println("Я получил Double = $anyObject, это число округляется до ${roundDoubleValue(anyObject)}")
        is LocalDate -> println("Я получил LocalDate = $anyObject, ${compareDates(anyObject)}")
        null -> println("Объект равен null")
        else -> println("Мне этот тип неизвестен(")
    }
}

private fun roundDoubleValue(double: Double): String {
    val resultDouble = Math.round((Math.round(double * 1000.0) / 1000.0) * 100.0) / 100.0
    var answerRepresentation = resultDouble.toString()

    if (resultDouble * 100 % 100 == 0.0)
        answerRepresentation = resultDouble.toInt().toString()

    return answerRepresentation
}

private fun compareDates(interestingDate: LocalDate): String {
    val tinkoffBirth = LocalDate.of(2006, 12, 24)
    val compare = interestingDate.compareTo(tinkoffBirth)
    var answer = ""

    when {
        compare >= 0 -> answer = "она не меньше даты основания Tinkoff"
        compare < 0 -> answer = "она меньше даты основания Tinkoff"
    }

    return answer
}