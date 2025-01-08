package array

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var p1 = m - 1
    var p2 = n - 1
    var writeIndex = (m + n) - 1
    while (p1 >= 0 && p2 >= 0) {
        if (nums1[p1] > nums2[p2]) {
            nums1[writeIndex] = nums1[p1]
            p1--
        } else {
            nums1[writeIndex] = nums2[p2]
            p2--
        }
        writeIndex--
    }
    while (p2 >= 0) {
        nums1[writeIndex] = nums2[p2]
        writeIndex--
        p2--
    }
}