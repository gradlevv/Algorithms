package string

fun reverseString(s: CharArray): Unit {
    var right = s.lastIndex
    var left = 0

    while (left < right) {
        s[right] = s[left].also { s[left] = s[right] }
        right--
        left++
    }
    println(s)
}