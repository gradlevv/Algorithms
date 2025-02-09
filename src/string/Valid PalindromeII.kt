package string

fun validPalindrome(s: String): Boolean {

    if (s.length <= 1) return true

    var left = 0
    var right = s.lastIndex

    while (left < right) {
        if (s[left] == s[right]) {
            left++
            right--
        } else {
            return when {
                palindromeCheck(s.substring(left, right)) ||
                        palindromeCheck(s.substring(left + 1, right + 1)) -> true

                else -> false
            }
        }
    }
    return true
}

fun palindromeCheck(s: String): Boolean {
    var left = 0
    var right = s.lastIndex

    while (left < right) {
        if (s[left] == s[right]) {
            left++
            right--
        } else {
            return false
        }
    }
    return true
}