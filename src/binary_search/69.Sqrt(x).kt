package binary_search

fun mySqrt(x: Int): Int {
    if (x == 0 || x == 1) return x
    var left = 0
    var right = x
    while (left <= right) {
        val middle = left + ((right - left) / 2)
        when {
            middle == x / middle -> return middle
            middle <= x / middle -> left = middle + 1
            else -> right = middle - 1
        }
    }
    return right
}