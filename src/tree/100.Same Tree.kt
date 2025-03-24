package tree

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {

    if (p == null && q == null) return true
    if (p == null || q == null || p.`val` != q.`val`) return false

    val result =  isSameTree(p.right, q.right) && isSameTree(p.left, q.left)

    return result
}