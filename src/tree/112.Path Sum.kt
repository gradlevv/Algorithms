package tree

import java.util.LinkedList
import java.util.Queue

//recursive
fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {

    if (root == null) return false
    if (root.`val` == targetSum && (root.left == null && root.right == null)) return true
    val remainingSum = targetSum - (root.`val`)

    return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum)
}

//iterative
fun hasPathSum2(root: TreeNode?, targetSum: Int): Boolean {

    if (root == null) return false

    val queue: Queue<Pair<TreeNode, Int>> = LinkedList()
    queue.add(root to targetSum)

    while (queue.isNotEmpty()) {

        val (node, target) = queue.poll()
        if (node.`val` == target && (node.left == null && node.right == null)) return true

        val remainingSum = target - node.`val`
        if (node.left != null)
            queue.add(node.left to remainingSum)
        if (node.right != null)
            queue.add(node.right to remainingSum)
    }

    return false
}