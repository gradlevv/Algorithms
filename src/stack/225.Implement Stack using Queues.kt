package stack

import java.util.LinkedList

class MyStack() {

    private var inputQueue = LinkedList<Int>()

    fun push(x: Int) {
        inputQueue.addLast(x)
    }

    fun pop(): Int {
        if (inputQueue.isNotEmpty())
            return inputQueue.removeLast()
        else
            throw IllegalStateException()
    }

    fun top(): Int {
        if (inputQueue.isNotEmpty())
            return inputQueue.last()
        else
            throw IllegalStateException()
    }

    fun empty(): Boolean {
        return inputQueue.isEmpty()
    }

}