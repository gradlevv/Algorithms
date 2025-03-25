package tree

fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {

    if (root == null) return false
    if (root.`val` == targetSum && (root.left == null && root.right == null)) return true
    val remainingSum = targetSum - (root.`val`)

    return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum)
}