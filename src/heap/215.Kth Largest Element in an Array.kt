package heap

fun findKthLargest(nums: IntArray, k: Int): Int {

    return when {
        nums.isEmpty() -> throw IllegalStateException()
        k > nums.size || k <= 0 -> Int.MIN_VALUE

        else -> {
            val targetIndex = nums.size - k
            val left = 0
            val right = nums.lastIndex

            return quickSelect(nums, left, right, targetIndex)

        }
    }

}

private fun quickSelect(nums: IntArray, from: Int, to: Int, targetIndex: Int): Int {

    val pivot = nums[to]
    var boundary = from - 1
    var traverse = from

    while (traverse < to) {
        if (nums[traverse] < nums[to]) {
            boundary++
            nums[traverse] = nums[boundary].also { nums[boundary] = nums[traverse] }
        }
        traverse++
    }
    nums[to] = nums[boundary + 1].also { nums[boundary + 1] = nums[to] }

    return when {
        boundary + 1 == targetIndex -> pivot
        boundary + 1 < targetIndex -> quickSelect(nums, boundary + 2, to, targetIndex)
        else -> quickSelect(nums, from, boundary, targetIndex)
    }
}

