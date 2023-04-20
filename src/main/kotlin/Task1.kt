import java.lang.Math.toIntExact

/*  Extension function for MutableList collection
    If Int overflows, an exception is thrown */
fun MutableList<Int>.power() {
    val iterate = this.listIterator()

    while (iterate.hasNext()) {
        val currentValue = iterate.next()
        val longPerformance : Long = currentValue.toLong()

        try {
            iterate.set(toIntExact(longPerformance * longPerformance))
        } catch (e: ArithmeticException) {
            throw ArithmeticException("Int overflow has been prevented for value to the power of 2: $currentValue")
        }
    }
}