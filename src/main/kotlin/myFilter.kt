fun <T> List<T>.myFilter(predicate: (T) -> Boolean): List<T> {
    if (this.size == 0) return this

    if (this.size == 1) {
        val x = this.single()
        return if (predicate(x)) this else emptyList()
    } else {
        val startOfList = this.slice(0..this.size - 2)
        val endOfList = listOf(this.last())
        return startOfList.myFilter(predicate) + endOfList.myFilter(predicate)
    }
}
