fun <T> applyFilter(list: List<T>, filter: (T) -> Boolean): List<T> {
    if (list.size == 0) return list

    if (list.size == 1) {
        val x = list.single()

        return if (filter(x)) list else emptyList()
    } else {
        val startOfList = list.slice(0..list.size - 2)
        val endOfList = listOf(list.last())

        return applyFilter(startOfList, filter) + applyFilter(endOfList, filter)
    }
}
