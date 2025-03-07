package binary_search

fun searchII(nums: IntArray, target: Int): Int {

    if (nums.isEmpty()) return -1
    if (nums.size == 1) {
        return if (nums[0] == target) 0 else -1
    }

    if (nums.size == 2) {
        return when (target) {
            nums[0] -> 0
            nums[1] -> 1
            else -> -1
        }
    }

    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val middle = left + ((right - left) / 2)
        when {
            nums[middle] == target -> return middle
            nums[left] <= nums[middle] -> {
                if (nums[left] <= target && target < nums[middle]) {
                    right = middle - 1
                } else {
                    left = middle + 1
                }
            }

            else -> {
                if (nums[middle] < target && target <= nums[right]) {
                    left = middle + 1
                } else {
                    right = middle - 1
                }
            }
        }
    }

    return -1
}