package array

fun containsDuplicate(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    for (value in nums) {
        if (!set.add(value)) {
            return true
        }
    }
    return false
}