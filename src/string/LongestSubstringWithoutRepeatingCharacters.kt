package string

fun lengthOfLongestSubstring(s: String): Int {
    var left = 0
    var right = 0
    val set = mutableSetOf<Char>()
    var maxLength = 0

    while (right < s.length) {
        if (set.add(s[right])) {
            maxLength = maxOf(right - left + 1, maxLength)
            right++
        } else {
            set.remove(s[left])
            left++
        }
    }

    return maxLength
}