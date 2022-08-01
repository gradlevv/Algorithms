package main.binarysearch

fun main() {

    val shiftedArray = arrayOf(18, 20, 28, 1, 2, 5, 8)
    val result = findTargetIndexInShiftedSortArray(shiftedArray, 0)

    println(result)
}

fun findTargetIndexInShiftedSortArray(array: Array<Int>, target: Int): Int {
    var left = 0
    var right = array.size - 1

    while (left <= right) {
        val mid = (left + right) / 2

        if (array[mid] == target)
            return mid
        else if (array[left] <= array[mid]) {

            if (target >= array[left] && target < array[mid]) {
                right = mid - 1
            } else
                left = mid + 1

        } else {

            if (target > array[mid] && target <= array[right]) {
                left = mid + 1
            } else
                right = mid - 1

        }
    }
    return -1
}