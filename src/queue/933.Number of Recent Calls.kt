package queue

import java.util.LinkedList
import java.util.Queue

class RecentCounter {
    private val queue: Queue<Int> = LinkedList()

    fun ping(t: Int): Int {

        queue.add(t)
        while (queue.peek() < t - 3000) {
            queue.remove()
        }
        return queue.size
    }
}

