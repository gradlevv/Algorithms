package linked_list

fun reverseList(head: ListNode?): ListNode? {
    if (head == null) return null

    var prev: ListNode? = null
    var current = head
    var next: ListNode?
    while (current != null) {
        next = current.next
        current.next = prev
        prev = current
        current = next

    }
    return prev
}