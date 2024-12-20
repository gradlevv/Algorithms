package array

fun pivotIndex(nums: IntArray): Int {
    val sum = nums.sum()
    var leftSum = 0
    for ((index, value) in nums.withIndex()) {
        val rightSum = sum - leftSum - value
        if (rightSum == leftSum) {
            return index
        }
        leftSum += value
    }
    return -1
}