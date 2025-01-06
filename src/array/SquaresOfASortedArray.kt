package array

import kotlin.math.abs

fun sortedSquares(nums: IntArray): IntArray {
    val summary = IntArray(nums.size)
    var writeIndex = nums.size - 1
    var left = 0
    var right = nums.size - 1
    while (writeIndex >= 0) {
        if (abs(nums[left]) > abs(nums[right])) {
            summary[writeIndex] = nums[left] * nums[left]
            left++
        } else {
            summary[writeIndex] = nums[right] * nums[right]
            right--
        }
        writeIndex--

    }
    return summary
}