package exercise.easy.id121

import io.kotest.assertions.print.print
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.WithDataTestName
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

data class TestCase(
    val prices: IntArray,
    val expected: Int,
) : WithDataTestName {
    override fun dataTestName(): String = expected.print().value
}

class Solution121Test : FunSpec({
    context("shouldBe") {
        withData(
            nameFn = { "Input: ${it.prices.print().value}, Expected: ${it.expected.print().value}" },
            TestCase(prices = intArrayOf(7, 1, 5, 3, 6, 4), expected = 5),
            TestCase(prices = intArrayOf(7, 6, 4, 3, 1), expected = 0),
            TestCase(prices = intArrayOf(2, 4, 1), expected = 2),
            TestCase(prices = intArrayOf(2, 1, 2, 0, 1), expected = 1),
            TestCase(prices = intArrayOf(3, 3, 5, 0, 0, 3, 1, 4), expected = 4),
        ) { (prices, expected) ->
            Solution121().maxProfit(prices) shouldBe expected
        }
    }
})