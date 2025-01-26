package array

fun findNumbers(nums: IntArray): Int {
    var evenCount = 0
    for (item in nums) {
        val number = item.toString()
        if (number.length % 2 == 0) {
            evenCount += 1
        }
    }
    return evenCount
}