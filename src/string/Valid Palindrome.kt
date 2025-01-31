package string

fun isPalindrome(s: String): Boolean {
    if (s.isEmpty() || s.length == 1) return true

    val filtered = s.filter { it.isLetterOrDigit() }.lowercase()
    var right = filtered.lastIndex
    var left = 0

    while (left < right){
        if (filtered[right] != filtered[left]) {
            return false
        } else {
            left++
            right--
        }
    }
    return true
}