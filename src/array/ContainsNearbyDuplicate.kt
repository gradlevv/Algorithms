package array

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {

    val set = mutableSetOf<Int>()
    if (nums.size == 1) return false
    for ((index, value) in nums.withIndex()) {
        if (set.contains(value).not()) {
            set.add(value)
            if (index >= k) {
                set.remove(nums[index - k])
            }
        } else {
            return true
        }
    }
    return false
}