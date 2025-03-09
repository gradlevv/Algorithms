package binary_search

fun findMin(nums: IntArray): Int {

    if (nums.size == 1) return nums[0]
    var left = 0
    var right = nums.size - 1
    while (left < right) {
        val middle = left + ((right - left) / 2)
        if (nums[middle] < nums[right]) {
            right = middle
        } else {
            left = middle + 1
        }
    }
    return nums[left]
}