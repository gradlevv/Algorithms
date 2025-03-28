package tree

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

