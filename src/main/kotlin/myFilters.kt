fun <T> List<T>.myRecursiveFilter(predicate: (T) -> Boolean): List<T> {
    if (this.size == 0) return this

    if (this.size == 1) {
        val x = this.single()
        return if (predicate(x)) this else emptyList()
    } else {
        val theLast = this.last()
        val theRest = this.slice(0..this.size - 2)
        return if (predicate(theLast)) {
            theRest.myRecursiveFilter(predicate) + theLast
        } else {
            theRest.myRecursiveFilter(predicate)
        }
    }
}

fun <T> List<T>.myLoopingFilter(predicate: (T) -> Boolean): List<T> {
    val list = mutableListOf<T>()
    this.forEach {
        if (predicate(it)) list.add(it)
    }
    return list.toList()
}

fun <T> List<T>.myFoldingFilter(predicate: (T) -> Boolean): List<T> =
    this.fold(emptyList(), { list, item ->
        if (predicate(item)) {
            list + item
        } else {
            list
        }
    })

tailrec fun <T> List<T>.myTailRecursiveFilter(
    predicate: (T) -> Boolean,
    acc: List<T> = emptyList()
): List<T> {
    if (this.size == 0) return acc

    val theFirst = this.first()
    val theRest = this.slice(1..this.size - 1)

    if (predicate(theFirst)) {
        return theRest.myTailRecursiveFilter(predicate, acc + theFirst)
    } else {
        return theRest.myTailRecursiveFilter(predicate, acc)
    }
}

fun numberIsEvenAndLessThan(aNumber: Int): (Int) -> Boolean {
    return { n: Int -> n % 2 == 0 && n < aNumber }
}
