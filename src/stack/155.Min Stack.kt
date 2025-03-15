package stack

import java.util.Stack

class MinStack() {

    private val mainStack = Stack<Int>()
    private val minStack = Stack<Int>()

    fun push(`val`: Int) {
        mainStack.push(`val`)
        if (minStack.isEmpty()) {
            minStack.push(`val`)
        } else if (`val` <= minStack.peek()) {
            minStack.push(`val`)
        }
    }

    fun pop() {
        if (mainStack.isNotEmpty()) {
           val popped =  mainStack.pop()
            if (popped == minStack.peek()) {
                minStack.pop()
            }
        }
    }

    fun top(): Int {
        if (mainStack.isEmpty()) throw IllegalArgumentException()
        return mainStack.peek()
    }

    fun getMin(): Int {
        if (minStack.isEmpty()) throw IllegalArgumentException()
        return minStack.peek()
    }

}