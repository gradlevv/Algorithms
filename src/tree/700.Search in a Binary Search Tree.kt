package tree

fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    return when {
        root == null -> null
        root.`val` == `val` -> root
        root.`val` < `val` -> searchBST(root.right, `val`)
        else -> searchBST(root.left, `val`)
    }
}

fun searchBST2(root: TreeNode?, `val`: Int): TreeNode? {
    if (root == null) return null
    if (root.`val` == `val`) return root

    var current = root
    while (current != null) {
        current = when {
            current.`val` == `val` -> return current
            current.`val` < `val` -> current.right
            else -> current.left
        }
    }

    return null
}