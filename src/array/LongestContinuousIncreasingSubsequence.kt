package array

fun findLengthOfLCIS(nums: IntArray): Int {

    if (nums.isEmpty()) return 0
    if (nums.size == 1) return 1

    var currentLength = 1
    var maxLength = 1

    for (index in 1..<nums.size) {
        if (nums[index - 1] < nums[index]) {
            currentLength++
        } else {
            currentLength = 1
        }

        if (currentLength > maxLength) {
            maxLength = currentLength
        }
    }

    return maxLength
}