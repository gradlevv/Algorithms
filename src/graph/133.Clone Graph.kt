package graph

import java.util.LinkedList
import java.util.Queue

fun cloneGraph(node: Node?): Node? {
    node ?: return null
    val map = mutableMapOf<Node, Node>()
    return helper(node, map)
}

fun helper(node: Node, map: MutableMap<Node, Node>): Node {
    if (map.contains(node)) return map.getValue(node)
    map[node] = Node(node.`val`)
    node.neighbors.forEach {
        it?.let {
            map.getValue(node).neighbors.add(helper(it, map))
        }
    }
    return map.getValue(node)
}

fun cloneGraphBFS(node: Node?): Node? {
    node ?: return null
    val map = mutableMapOf<Node, Node>()
    val queue: Queue<Node> = LinkedList()
    queue.add(node)
    map[node] = Node(node.`val`)

    while (queue.isNotEmpty()) {
        val remove = queue.poll()
        remove.neighbors.forEach {
            if (map.containsKey(it).not()) {
                it?.let {
                    map[it] = Node(it.`val`)
                    queue.add(it)
                }
            }
            map.getValue(remove).neighbors.add(map[it])
        }
    }
    return map[node]
}