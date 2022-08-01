fun main() {

    val array = arrayOf(1, 2, 5, 8, 11, 12, 18, 20)
    val result = findTargetIndexSortedArray(array, 1)

    println(result)
}

fun findTargetIndexSortedArray(array: Array<Int>, target: Int): Int {
    var left = 0;
    var right = array.size - 1

    while (left <= right) {
        val middle = (left + right) / 2
        if (array[middle] == target) {
            return middle
        } else if (target < array[middle]) {
            right = middle - 1
        } else
            left = middle + 1

    }
    return -1
}