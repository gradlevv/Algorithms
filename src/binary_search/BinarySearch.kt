package binary_search

fun search(nums: IntArray, target: Int): Int {

    when (nums.size) {
        0 -> return -1
        1 -> {
            return if (nums[0] == target) 0 else -1
        }
    }
    var left = 0
    var right = nums.size - 1
    while (left <= right) {
        val mid = left + ((right - left) / 2)
        when {
            nums[mid] == target -> return mid
            nums[mid] > target -> right = mid - 1
            else -> left = mid + 1
        }
    }
    return -1
}