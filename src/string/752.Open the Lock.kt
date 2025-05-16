package string

import java.util.LinkedList
import java.util.Queue

fun openLock(deadends: Array<String>, target: String): Int {
    if (target == "0000") return 0
    if (deadends.contains("0000")) return -1
    if (deadends.contains(target)) return -1

    val queue: Queue<Pair<String, Int>> = LinkedList()
    queue.add("0000" to 0)
    val visited = deadends.toMutableSet().apply {
        add("0000")
    }

    while (queue.isNotEmpty()) {
        val (step, count) = queue.poll()
        if (step == target) return count
        val neighbours = generateNeighbours(step, visited)
        neighbours.forEach {
            if (visited.add(it)) {
                queue.add(it to count + 1)
            }
        }
    }
    return -1
}

fun generateNeighbours(combination: String, deadends: Set<String>): List<String> {

    val neighbours = mutableListOf<String>()
    val converted = combination.toCharArray()
    for (i in 0..3) {
        val digit = converted[i] - '0'
        val incremented = (digit + 1) % 10
        val incrementedDigit = combination.substring(0, i) + incremented + combination.substring(i + 1)
        if (deadends.contains(incrementedDigit).not()) {
            neighbours.add(incrementedDigit)
        }
        val decremented = (digit - 1 + 10) % 10
        val decrementedDigit = combination.substring(0, i) + decremented + combination.substring(i + 1)
        if (deadends.contains(decrementedDigit).not()) {
            neighbours.add(decrementedDigit)
        }
    }
    return neighbours
}
