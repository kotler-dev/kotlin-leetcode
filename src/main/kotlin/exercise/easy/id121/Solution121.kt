package exercise.easy.id121

class Solution121 {
    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0
        var profit = 0
        var min = Int.MAX_VALUE
        var max = 0

        for (i in 0..<prices.size) {
            if (prices[i] < min) {
                min = prices[i]
                max = 0
            }
            if (prices[i] > max) max = prices[i]
            if (max - min > profit) profit = max - min
        }
        return profit
    }

    /*

    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0
        var profit = 0
        var min = Int.MAX_VALUE
        var max = 0

        val minn = prices.slice(1..<prices.size).minBy { it }
        val m = prices.slice(1..<prices.size).maxBy { it }
        val mIndex = prices.lastIndexOf(m)

        for (i in 0..mIndex) {
            if (prices[i] < min) {
                min = prices[i]
                max = m
            }
            if (prices[i] > max) max = prices[i]
            if (max - min > profit) profit = max - min
        }
        return profit
    }

    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0
        var profit = 0
        for (i in prices.indices) {
            for (j in i + 1..<prices.size) {
                if (prices[j] - prices[i] > profit) {
                    profit = prices[j] - prices[i]
                }
            }
        }
        return profit
    }

    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0
        var profit = 0

        val min = prices.slice(0..prices.size - 1).indices.minBy { prices[it] }
        val minIndex = prices.lastIndexOf(prices[min])
        val p = prices.slice(minIndex..prices.size - 1)

        val max = p.indices.maxBy { p[it] }
        val maxIndex = p.lastIndexOf(p[max])

        val result = p[maxIndex] - prices[minIndex]
        if (result > profit) profit = result
        return profit
    }

    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        for ((index, value) in prices.withIndex()) {
            val i1 = index + 1
            if (i1 < prices.size) {
                if (prices[i1] > value) {
                    val max = prices.slice(i1..prices.size - 1).max()
                    if (profit < max - value) {
                        profit = max - value
                    }
                }
            }
        }
        return profit
    }

    fun maxProfit(prices: IntArray): Int {
        var profit = 0

        val minIndex = prices.indices.minBy { prices[it] } ?: 0
        val slice = prices.slice(minIndex..prices.size - 1)
        val maxIndex = slice.indices.maxBy { slice[it] } ?: 0
        val result = slice[maxIndex] - prices[minIndex]

        if (result > profit) profit = result

        return profit
    }

    fun maxProfit(prices: IntArray): Int {
        if (prices.size < 2) return 0
        var profit = 0
        val maxSlice = prices.slice(1..prices.size - 1)
        val maxIndex = maxSlice.indices.maxBy { maxSlice[it] } ?: 0
        val minSlice = prices.slice(0..maxSlice.lastIndexOf(maxSlice[maxIndex]))
        val minIndex = minSlice.indices.minBy { minSlice[it] } ?: 0
        val result = maxSlice[maxIndex] - minSlice[minIndex]
        if (result > profit) profit = result
        return profit
    }

*/
}