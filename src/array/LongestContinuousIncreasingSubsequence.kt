package array

fun findLengthOfLCIS(nums: IntArray): Int {

    if (nums.size <= 1) return nums.size

    var currentLength = 1
    var maxLength = 1

    for (index in 1..<nums.size) {
        if (nums[index - 1] < nums[index]) {
            currentLength++
        } else {
            currentLength = 1
        }
        maxLength = maxOf(maxLength, currentLength)
    }

    return maxLength
}