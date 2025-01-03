package array

fun removeElement(nums: IntArray, k: Int): Int {
    var writeIndex = 0
    for (index in nums.indices) {
        if (nums[index] != k) {
            nums[writeIndex] = nums[index]
            writeIndex++
        }
    }
    return writeIndex
}