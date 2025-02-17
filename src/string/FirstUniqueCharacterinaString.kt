package string

fun firstUniqChar(s: String): Int {

    val map = s.groupingBy { it }.eachCount()

    for ((index, item) in s.withIndex()) {
        if (map.getValue(item) == 1) {
            return index
        }
    }
    return -1
}