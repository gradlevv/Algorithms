package array

import java.util.LinkedList
import java.util.Queue

fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {

    if (sr !in image.indices || sc !in image[0].indices) return image
    val originalColor = image[sr][sc]
    if (image[sr][sc] == color) return image
    image[sr][sc] = color

    val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
    for ((dx, dy) in directions) {
        val newX = sr + dx
        val newY = sc + dy
        if (newX in image.indices && newY in image[0].indices) {
            if (image[newX][newY] == originalColor) {
                floodFill(image, newX, newY, color)
            }
        }
    }

    return image
}

fun floodFillBFS(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {

    val originalColor = image[sr][sc]
    if (originalColor == color) return image

    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(sr to sc)
    image[sr][sc] = color

    val directions = listOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    while (queue.isNotEmpty()) {

        val (x, y) = queue.remove()
        for ((dx, dy) in directions) {
            val newX = x + dx
            val newY = y + dy
            if (newX in image.indices && newY in image[0].indices) {
                if (image[newX][newY] == originalColor) {
                    image[newX][newY] = color
                    queue.add(newX to newY)
                }
            }
        }

    }

    return image
}