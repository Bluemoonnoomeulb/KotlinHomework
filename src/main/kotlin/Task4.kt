
/*  Method prints the word representation of the number
    Returns string */
fun writeNumber(number : Int) : String {
    val digits = arrayListOf("один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять")
    val belowTwenty = arrayListOf("десять", "одиннадцать", "двенадцадь", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать")
    val tens = arrayListOf("двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто")
    val hundreds = arrayListOf("сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот", "тысяча")

    var representation : String = ""

    when (number) {
        in 1..9 -> representation += digits[number-1]
        in 10..19 -> representation += belowTwenty[number % 10]
        in 20..99 -> {
            representation += tens[number / 10 - 2]
            if (number % 10 != 0)
                representation += " " + digits[number % 10 - 1]
        }
        in 100..999 -> {
            representation += hundreds[number / 100 - 1]
            if (number % 100 / 10 != 0)
                representation += " " + if (number % 100 / 10 == 1) belowTwenty[number % 10] else tens[number % 100 / 10 - 2]
            if (number % 100 / 10 != 1 && number % 10 != 0)
                representation += " " + digits[number % 10 - 1]
        }
        1000 -> representation += hundreds[9]
        else -> representation = "Ошибка! Неверные входные данные."
    }

    return representation
}