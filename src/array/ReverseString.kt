package array

fun reverseString(s: CharArray): Unit {
    var right = s.lastIndex
    var left = 0

    while (left < right) {
        val temp = s[right]
        s[right] = s[left]
        s[left] = temp
        right--
        left++
    }
    println(s)
}