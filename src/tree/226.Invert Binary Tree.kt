package tree

fun invertTree(root: TreeNode?): TreeNode? {

    if (root == null) return null

    root.right = root.left.also { root.left = root.right }

    invertTree(root.left)
    invertTree(root.right)

    return root
}
