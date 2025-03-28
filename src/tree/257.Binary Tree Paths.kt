package tree

fun binaryTreePaths(root: TreeNode?): List<String> {

    when {
        root == null -> return emptyList()
        root.left == null && root.right == null -> return listOf(root.`val`.toString())
    }

    return binaryTreePaths(root?.left).map { "${root?.`val`}->$it" } +
            binaryTreePaths(root?.right).map { "${root?.`val`}->$it" }
}
