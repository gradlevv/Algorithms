package dp

fun climbStairs(n: Int): Int {
    if (n == 1) return 1
    if (n == 2) return 2
    var prev1 = 2
    var prev2 = 1
    for (item in 3..n) {
        val current = prev1 + prev2
        prev2 = prev1
        prev1 = current
    }
    return prev1
}