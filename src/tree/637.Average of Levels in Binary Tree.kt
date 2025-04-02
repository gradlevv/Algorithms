package tree

import java.util.LinkedList
import java.util.Queue

fun averageOfLevels(root: TreeNode?): DoubleArray {

    root ?: return doubleArrayOf()

    val result = mutableListOf<Double>()
    val queue: Queue<TreeNode> = LinkedList<TreeNode>().apply {
        push(root)
    }

    while (queue.isNotEmpty()) {
        val levelSize = queue.size
        var levelSum = 0L
        repeat(levelSize) {
            val current = queue.poll()
            levelSum += current.`val`
            current.left?.let { queue.add(it) }
            current.right?.let { queue.add(it) }
        }
        result.add((levelSum.toDouble() / levelSize.toDouble()))
    }

    return result.toDoubleArray()
}
