package tree

import java.util.LinkedList
import java.util.Queue


//recursive
fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0

    return 1 + maxOf(maxDepth(root.left), maxDepth(root.right))
}

// iterative
fun maxDepth2(root: TreeNode?): Int {

    if (root == null) return 0

    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)
    var depth = 0

    while (queue.isNotEmpty()) {
        depth++
        val levelSize = queue.size
        for (item in 0..<levelSize) {
            val currentNode = queue.remove()
            if (currentNode.left != null) {
                queue.add(currentNode.left)
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right)
            }
        }
    }

    return depth
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}