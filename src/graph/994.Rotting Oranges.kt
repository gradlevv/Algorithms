package graph

import java.util.LinkedList
import java.util.Queue

fun orangesRotting(grid: Array<IntArray>): Int {
    if (grid.isEmpty()) return 0

    var fresh = 0
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
    for (i in grid.indices) {
        for (j in grid[i].indices) {
            when {
                grid[i][j] == 2 -> queue.add(i to j)
                grid[i][j] == 1 -> fresh++
            }
        }
    }
    if (fresh == 0) return 0
    if (queue.isEmpty()) return -1
    var minutes = -1
    while (queue.isNotEmpty()) {
        val level = queue.size
        repeat(level) {
            val (neighbourI, neighbourJ) = queue.remove()
            for ((dx, dy) in directions) {
                val newI = neighbourI + dx
                val newJ = neighbourJ + dy
                if (newI in grid.indices && newJ in grid[0].indices) {
                    if (grid[newI][newJ] == 1) {
                        grid[newI][newJ] = 2
                        fresh--
                        queue.add(newI to newJ)
                    }
                }
            }
        }
        minutes++
    }
    return if (fresh == 0) minutes else -1
}