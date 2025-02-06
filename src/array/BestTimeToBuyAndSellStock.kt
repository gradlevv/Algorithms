package array

fun maxProfit(prices: IntArray): Int {
    var minPrice = prices[0]
    var maxProfit = 0
    for (currentPrice in prices) {
        if (currentPrice < minPrice) {
            minPrice = currentPrice
        } else if (currentPrice - minPrice > maxProfit) {
            maxProfit = currentPrice - minPrice
        }
    }
    return maxProfit
}