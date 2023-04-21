
/*  List processing method
    Returns the sum of the remaining elements */
fun getSum(list : List<Double?>) : Double {
    return list
        .asSequence()
        .filterNot { it == null}
        .map {
            if (it!!.toInt() % 2 == 0)
                it * it
            else
                it / 2
        }
        .filterNot { it > 25 }
        .sortedDescending()
        .take(10)
        .sum()
}