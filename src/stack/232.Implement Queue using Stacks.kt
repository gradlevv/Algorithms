package stack

import java.util.Stack

class MyQueue() {

    private val inputStack = Stack<Int>()
    private val outputStack = Stack<Int>()

    fun push(x: Int) {
        inputStack.add(x)
    }

    fun pop(): Int {
        if (outputStack.isEmpty()){
            while (inputStack.isNotEmpty()){
                outputStack.add(inputStack.pop())
            }
        }
       return outputStack.pop()
    }

    fun peek(): Int {
        if (outputStack.isEmpty()){
            while (inputStack.isNotEmpty()){
                outputStack.add(inputStack.pop())
            }
        }
        return outputStack.peek()
    }

    fun empty(): Boolean {
        return inputStack.isEmpty() && outputStack.isEmpty()
    }

}