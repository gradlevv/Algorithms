import array.intersection
import array.maxProfit
import linked_list.ListNode
import linked_list.reverseList
import string.firstUniqChar
import string.lengthOfLongestSubstring
import string.validPalindrome

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val num1 = intArrayOf(1, 2, 2, 1)
    val num2 = intArrayOf(2, 2)
    val s = charArrayOf('h', 'e', 'z', 'l', 'o')
    val string = "loveleetcode"
//    println(intersection(num1, num2))

    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    val node4 = ListNode(4)
    val node5 = ListNode(5)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5

    println(reverseList(node1)?.value)
}