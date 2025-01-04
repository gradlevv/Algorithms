package array

fun removeDuplicates(nums: IntArray): Int {
    var writeIndex = 1
    for (index in 1 until nums.size) {
        if (nums[index] != nums[index - 1]) {
            nums[writeIndex] = nums[index]
            writeIndex++
        }
    }
    return writeIndex
}