package array

fun twoSumII(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.lastIndex
    while (left < right) {
        if (numbers[left] + numbers[right] > target) return intArrayOf()
        if (numbers[left] + numbers[right] == target) {
            return intArrayOf(left + 1, right + 1)
        } else if (numbers[left] + numbers[right] < target) {
            left++
        } else {
            right--
        }

    }
    return intArrayOf()
}