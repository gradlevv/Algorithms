package graph

import linked_list.deleteNode
import java.util.LinkedList
import java.util.Queue

fun numIslands(grid: Array<CharArray>): Int {
    if (grid.isEmpty()) return 0

    var counter = 0
    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (grid[i][j] == '1') {
                counter++
                dfs(grid, i, j)
            }
        }
    }
    return counter
}

fun dfs(grid: Array<CharArray>, i: Int, j: Int) {

    if (i !in grid.indices || j !in grid[0].indices) return
    if (grid[i][j] == '0') return
    grid[i][j] = '0'
    dfs(grid, i - 1, j)
    dfs(grid, i + 1, j)
    dfs(grid, i, j - 1)
    dfs(grid, i, j + 1)
}

fun numIslandsBFS(grid: Array<CharArray>): Int {
    if (grid.isEmpty()) return 0

    val queue: Queue<Pair<Int, Int>> = LinkedList()
    val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
    var counter = 0
    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (grid[i][j] == '1') {
                counter++
                grid[i][j] = '0'
                queue.add(i to j)
                while (queue.isNotEmpty()) {
                    val (neighbourI, neighbourJ) = queue.remove()
                    for ((dx, dy) in directions) {
                        val newI = neighbourI + dx
                        val newJ = neighbourJ + dy

                        if (newI in grid.indices && newJ in grid[0].indices) {
                            if (grid[newI][newJ] == '1') {
                                grid[newI][newJ] = '0'
                                queue.add(newI to newJ)
                            }
                        }
                    }
                }
            }
        }
    }
    return counter
}