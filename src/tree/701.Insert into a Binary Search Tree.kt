package tree

fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
    when {
        root == null -> return TreeNode(`val`)
        root.`val` < `val` -> root.right = insertIntoBST(root.right, `val`)
        else -> root.left = insertIntoBST(root.left, `val`)
    }
    return root
}

fun insertIntoBST2(root: TreeNode?, `val`: Int): TreeNode? {

    if (root == null) return TreeNode(`val`)

    var current = root
    var parent: TreeNode = root
    while (current != null) {
        parent = current
        current = when {
            current.`val` < `val` -> {
                current.right
            }

            else -> {
                current.left
            }
        }

    }

    if (parent.`val` < `val`) {
        parent.right = TreeNode(`val`)
    } else {
        parent.left = TreeNode(`val`)
    }

    return root
}