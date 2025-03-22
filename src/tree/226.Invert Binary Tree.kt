package tree

import java.util.LinkedList
import java.util.Queue

fun invertTree(root: TreeNode?): TreeNode? {

    if (root == null) return null

    root.right = root.left.also { root.left = root.right }

    invertTree(root.left)
    invertTree(root.right)

    return root
}

fun invertTree2(root: TreeNode?): TreeNode? {

    if (root == null) return null

    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)

    while (queue.isNotEmpty()) {

        val current = queue.remove()
        current.right = current.left.also { current.left = current.right }

        if (current.left != null) {
            queue.add(current.left)
        }
        if (current.right != null) {
            queue.add(current.right)
        }

    }


    return root
}
