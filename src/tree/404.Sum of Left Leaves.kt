package tree

import java.util.ArrayDeque

fun sumOfLeftLeaves(root: TreeNode?): Int {
    if (root == null) return 0

    fun sumOfLeft(node: TreeNode?, isLeft: Boolean): Int {
        return when {
            node == null -> 0
            isLeft && node.isLeaf() -> node.`val`
            else -> sumOfLeft(node.left, true) + sumOfLeft(node.right, false)
        }
    }
    return sumOfLeft(root.left, isLeft = true) + sumOfLeft(root.right, isLeft = false)
}

fun TreeNode.isLeaf() = this.left == null && this.right == null

fun sumOfLeftLeaves2(root: TreeNode?): Int {

    if (root == null) return 0

    val stack = ArrayDeque<Pair<TreeNode, Boolean>>().apply {
        add(root to false)
    }
    var sum = 0

    while (stack.isNotEmpty()) {

        val (current, isLeft) = stack.pop()
        when {
            isLeft && current.isLeaf() -> sum += current.`val`
            else -> {
                current.right?.let { stack.add(it to false) }
                current.left?.let { stack.add(it to true) }
            }
        }

    }

    return sum
}
