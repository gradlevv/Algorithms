package graph

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

