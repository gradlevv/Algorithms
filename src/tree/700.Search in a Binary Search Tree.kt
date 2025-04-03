package tree

fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    return when {
        root == null -> null
        root.`val` == `val` -> root
        root.`val` < `val` -> searchBST(root.right, `val`)
        else -> searchBST(root.left, `val`)
    }
}