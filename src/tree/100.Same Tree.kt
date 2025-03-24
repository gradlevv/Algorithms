package tree

import java.util.LinkedList
import java.util.Queue

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {

    if (p == null && q == null) return true
    if (p == null || q == null || p.`val` != q.`val`) return false

    val result = isSameTree(p.right, q.right) && isSameTree(p.left, q.left)

    return result
}

fun isSameTree2(p: TreeNode?, q: TreeNode?): Boolean {

    val queue: Queue<Pair<TreeNode?, TreeNode?>> = LinkedList()
    queue.add(Pair(q, p))

    while (queue.isNotEmpty()) {
        val (pNode, qNode) = queue.poll()

        if (pNode == null && qNode == null) continue
        if (qNode == null || pNode == null || pNode.`val` != qNode.`val`) return false

        queue.add(Pair(pNode.left,qNode.left))
        queue.add(Pair(pNode.right,qNode.right))
    }

    return true
}