package tree

fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
    when {
        root == null -> return TreeNode(`val`)
        root.`val` < `val` -> root.right = insertIntoBST(root.right, `val`)
        else -> root.left = insertIntoBST(root.left, `val`)
    }
    return root
}