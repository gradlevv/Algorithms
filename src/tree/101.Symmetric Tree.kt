package tree

import kotlin.collections.ArrayDeque

fun isSymmetric(root: TreeNode?): Boolean {
    return when {
        root == null -> true
        else -> isMirror(right = root.right, left = root.left)
    }
}

fun isMirror(left: TreeNode?, right: TreeNode?): Boolean {
    return when {
        left == null && right == null -> true
        right?.`val` != left?.`val` -> false
        else -> {
            isMirror(right = right?.right, left = left?.left) &&
                    isMirror(right = left?.right, left = right?.left)
        }
    }

}

fun isSymmetric2(root: TreeNode?): Boolean {
    if (root == null) return true

    val stack = ArrayDeque<Pair<TreeNode?, TreeNode?>>()
    stack.add(root.left to root.right)

    while (stack.isNotEmpty()) {
        val (right, left) = stack.removeLast()
        if (right == null && left == null) continue
        if (right == null || left == null) return false
        if (right.`val` != left.`val`) return false
        stack.add(right.right to left.left)
        stack.add(right.left to left.right)
    }

    return true
}
