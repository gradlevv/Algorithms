package string

import java.util.Stack

fun isValid(s: String): Boolean {
    if (s.isEmpty()) return true
    if (s.length == 1) return false

    val stack = Stack<Char>()
    val map = mapOf('(' to ')', '{' to '}', '[' to ']')

    for (item in s) {
        if (item in map.keys) {
            stack.push(item)
        } else {
            if (stack.isEmpty()) return false
            if (map.getValue(stack.peek()) == item) {
                stack.pop()
            } else
                return false
        }
    }
    return stack.isEmpty()
}