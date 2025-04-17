package graph

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

class Node(var `val`: Int) {
    var neighbors: ArrayList<Node?> = ArrayList()
}