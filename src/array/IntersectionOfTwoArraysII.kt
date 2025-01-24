package array

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {

    val hashMap: MutableMap<Int, Int> = if (nums2.size > nums1.size)
        nums1.toList().groupingBy { it }.eachCount().toMutableMap()
    else
        nums2.toList().groupingBy { it }.eachCount().toMutableMap()

    val result = mutableListOf<Int>()

    if (nums2.size > nums1.size) {
        for (item in nums2) {
            val key = hashMap[item] ?: 0
            if (key > 0) {
                hashMap[item] = key - 1
                result.add(item)
            }
        }
    } else {
        for (item in nums1) {
            val key = hashMap[item] ?: 0
            if (key > 0) {
                hashMap[item] = key - 1
                result.add(item)
            }
        }
    }

    return result.toIntArray()
}