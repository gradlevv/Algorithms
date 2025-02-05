package array

fun minSubArrayLen(target: Int, nums: IntArray): Int {
    var left = 0
    var currentSum = 0
    var minimum = Int.MAX_VALUE

    for (right in nums.indices) {
        currentSum += nums[right]
        while (currentSum >= target) {
            minimum = minOf(minimum, right - left + 1)
            currentSum -= nums[left]
            left++
        }
    }
    if (minimum == Int.MAX_VALUE)
        minimum = 0

    return minimum
}