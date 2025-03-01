package array

fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1
    while (left <= right) {
        val mid = left + ((right - left) / 2)
        if (target == nums[mid]) {
            return mid
        } else if (target < nums[mid]) {
            right = mid - 1
        } else {
            left = mid + 1
        }

    }
    return left
}