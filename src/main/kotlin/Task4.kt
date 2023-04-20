
fun writeNumber(number : Int) : String {
    val DIGITS = arrayListOf("один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять")
    val BELOW_TWENTY = arrayListOf("десять", "одиннадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать")
    val TENS = arrayListOf("двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто")
    val HUNDREDS = arrayListOf("сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот", "тысяча")

    var representation : String = ""

    when (number) {
        in 1..9 -> representation += DIGITS[number-1]
        in 10..19 -> representation += BELOW_TWENTY[number % 10]
        in 20..99 -> {
            representation += TENS[number / 10 - 2]
            if (number % 10 != 0)
                representation += " " + DIGITS[number % 10 - 1]
        }
        in 100..999 -> {
            representation += HUNDREDS[number / 100 - 1]
            if (number % 100 / 10 != 0)
                if (number % 100 / 10 == 1)
                    representation += " " + BELOW_TWENTY[number % 10]
                else
                    representation += " " + TENS[number % 100 / 10 - 2]
            if (number % 100 / 10 != 1 && number % 10 != 0)
                representation += " " + DIGITS[number % 10 - 1]
        }
        1000 -> representation += HUNDREDS[9]
        else -> println("Ошибка! Неверные входные данные.")
    }

    return representation
}