import linked_list.*
import queue.RecentCounter
import tree.TreeNode
import tree.averageOfLevels
import tree.levelOrder


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val num1 = intArrayOf(-1, 0, 3, 5, 9, 12)
    val num2 = intArrayOf(5, 1, 2, 3, 4)
    val s = charArrayOf('h', 'e', 'z', 'l', 'o')
    val string = "loveleetcode"
//    println(intersection(num1, num2))

    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(2)
    val node4 = ListNode(1)

    node1.next = node2
    node2.next = node3
    node3.next = node4

    val recentCounter = RecentCounter()
    //[[], [1], [100], [3001], [3002]]
//    println(recentCounter.ping(1))
//    println(recentCounter.ping(100))
//    println(recentCounter.ping(3001))
//    println(recentCounter.ping(3002))

    //[3,9,20,null,null,15,7]

    val root = TreeNode(3).apply {
        left = TreeNode(9).apply {
            left = null  // Explicitly shown (optional)
            right = null
        }
        right = TreeNode(20).apply {
            left = TreeNode(15).apply {
                left = null
                right = null
            }
            right = TreeNode(7).apply {
                left = null
                right = null
            }
        }
    }

    val root2 = TreeNode(3).apply {
        left = TreeNode(9).apply {
            left = TreeNode(15)
            right = TreeNode(7)
        }
        right = TreeNode(20)
    }
    val root3 = TreeNode(2147483647).apply {
        left = TreeNode(2147483647)
        right = TreeNode(2147483647)
    }

    val result = averageOfLevels(root3)
    println(result.toString())
}