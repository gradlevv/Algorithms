package array

fun twoSum(nums: IntArray, target: Int): IntArray {
    val foundCombinations = hashMapOf<Int, Int>()
    for ((index, item) in nums.withIndex()) {
        val result = target - item
        if (foundCombinations.containsKey(result)) {
            return intArrayOf(foundCombinations.getOrDefault(result, 0), index)
        } else {
            foundCombinations[item] = index
        }
    }
    return intArrayOf()
}