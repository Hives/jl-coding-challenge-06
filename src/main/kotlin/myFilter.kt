fun applyFilter(list: List<Int>, filter: (Int) -> Boolean): List<Int> {
    if (list.size == 0) return list

    if (list.size == 1) {
        return if (filter(list[0])) list else listOf<Int>()
    } else {
        val splitList = list.chunked((list.size + 1) / 2)
        return applyFilter(splitList[0], filter) + applyFilter(splitList[1], filter)
    }
}
