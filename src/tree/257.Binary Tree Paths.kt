package tree

import java.util.Stack

fun binaryTreePaths(root: TreeNode?): List<String> {

    when {
        root == null -> return emptyList()
        root.left == null && root.right == null -> return listOf(root.`val`.toString())
    }

    return binaryTreePaths(root?.left).map { "${root?.`val`}->$it" } +
            binaryTreePaths(root?.right).map { "${root?.`val`}->$it" }
}

fun binaryTreePaths2(root: TreeNode?): List<String> {

    if (root == null) return listOf()

    val stack = Stack<Pair<TreeNode, String>>()
    val result = mutableListOf<String>()

    stack.push(root to "")

    while (stack.isNotEmpty()) {

        val (node, path) = stack.pop()

        if (node.left == null && node.right == null) {
            result.add("$path${node.`val`}")
        } else {
            node.left?.let {
                stack.push(it to "$path${node.`val`}->")
            }
            node.right?.let {
                stack.push(it to "$path${node.`val`}->")
            }
        }

    }

    return result
}
