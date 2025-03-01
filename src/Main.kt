import array.intersection
import array.maxProfit
import array.searchInsert
import linked_list.*
import string.firstUniqChar
import string.lengthOfLongestSubstring
import string.validPalindrome

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val num1 = intArrayOf(1,3,5,6)
    val num2 = intArrayOf(2, 2)
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

    println(searchInsert(num1,2))
}