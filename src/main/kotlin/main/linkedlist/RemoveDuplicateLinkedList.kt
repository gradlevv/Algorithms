package main.linkedlist

fun main() {

    val node = ListNode(1)
    val node2 = ListNode(1)
    val node3 = ListNode(2)
    val node4 = ListNode(4)
    val node5 = ListNode(4)

    val list = CustomLinkedList(node)

    list.append(node2)
    list.append(node3)
    list.append(node4)
    list.append(node5)

    println(list.print())
    list.deleteDuplicates()
    println(list.print())
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class CustomLinkedList(value: ListNode? = null) {
    private var head: ListNode?
    private var tail: ListNode?

    private var length: Int

    init {

        head = value
        tail = value
        length = 1
    }

    fun append(value: ListNode) {
        if (length == 0) {
            head = value
        } else {
            tail?.next = value
        }
        tail = value
        length++
    }

    //https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/
    fun deleteDuplicates() {

        var current = head

        while (current?.next != null) {
            if (current.`val` == current.next?.`val`) {
                current.next = current.next?.next

            } else {
                current = current.next
            }
        }
    }

    fun print() {
        var temp = head
        while (temp != null) {
            print("${temp.`val`} -> ")
            temp = temp.next
        }
    }
}


