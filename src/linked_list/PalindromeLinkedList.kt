package linked_list

fun isPalindrome(head: ListNode?): Boolean {

    var slow = head
    var fast = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    var prev: ListNode? = null
    var next: ListNode?
    var current = slow
    while (current != null) {
        next = current.next
        current.next = prev
        prev = current
        current = next
    }

    var firstHalf = head
    var secondHalf = prev
    while (secondHalf != null) {
        if (firstHalf?.value != secondHalf.value) {
            return false
        }
        firstHalf = firstHalf.next
        secondHalf = secondHalf.next
    }

    return true
}