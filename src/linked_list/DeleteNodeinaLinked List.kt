package linked_list

fun deleteNode(node: ListNode?) {
    node?.value = node?.next?.value ?:0
    node?.next = node?.next?.next
}