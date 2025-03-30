package tree

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
