package array

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {

    val (smaller, bigger) = if (nums1.size > nums2.size) nums2 to nums1 else nums1 to nums2

    val result = mutableSetOf<Int>()
    val converted = smaller.toSet()
    for (item in bigger) {
        if (converted.contains(item)) {
            result.add(item)
        }
    }

    return result.toIntArray()
}