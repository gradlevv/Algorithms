package array

import kotlin.math.max

fun findMaxAverage(nums: IntArray, k: Int): Double {

    var currentSum = 0
    for (i in 0..<k) {
        currentSum += nums[i]
    }

    var maxSum = currentSum

    for (j in k..<nums.size) {
        currentSum += nums[j] - nums[j - k]
        maxSum = max(currentSum, maxSum)
    }

    return maxSum.toDouble() / k
}