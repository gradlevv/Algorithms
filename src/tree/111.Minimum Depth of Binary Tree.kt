package tree

import java.util.LinkedList
import java.util.Queue

fun minDepth(root: TreeNode?): Int {
    if (root == null) return 0

    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)
    var minimumDepth = 1
    while (queue.isNotEmpty()) {
        val levelSize = queue.size
        for (i in 0..<levelSize) {
            val current = queue.remove()
            if (current.isLeaf())
                return minimumDepth
            current.left?.let { queue.add(it) }
            current.right?.let { queue.add(it) }
        }
        minimumDepth++
    }

    return minimumDepth
}