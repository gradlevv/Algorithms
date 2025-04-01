package tree

import java.util.*

fun levelOrder(root: TreeNode?): List<List<Int>> {
    root ?: return emptyList()

    val orders = mutableListOf<List<Int>>()
    val queue: Queue<TreeNode> = LinkedList<TreeNode>().apply {
        push(root)
    }

    while (queue.isNotEmpty()) {

        val levelSize = queue.size
        val levelValues = mutableListOf<Int>()
        repeat(levelSize) {
            val current = queue.poll()
            levelValues.add(current.`val`)
            current.left?.let { queue.add(it) }
            current.right?.let { queue.add(it) }
        }
        orders.add(levelValues)
    }

    return orders.toList()
}