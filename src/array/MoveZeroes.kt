package array

fun moveZeroes(nums: IntArray) {

    var writeIndex = 0
    for (index in nums.indices) {
        if (nums[index] != 0) {
            nums[writeIndex] = nums[index]
            writeIndex++
        }
    }
    while (writeIndex < nums.size) {
        nums[writeIndex] = 0
        writeIndex++
    }
    println(nums.toList())
}