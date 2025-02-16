package string

fun firstUniqChar(s: String): Int {

    val map = s.withIndex().groupBy({ it.value }, { it.index })
    for (item in s) {
        val key = map[item]
        if (key?.size == 1) {
            return key.first()
        }
    }
    return -1
}