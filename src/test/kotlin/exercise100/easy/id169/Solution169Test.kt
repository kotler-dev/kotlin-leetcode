package exercise100.easy.id169

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

class Solution169Test : FunSpec({
    context("shouldBe") {
        withData(
            nameFn = { "Input: ${it.prices.print().value}, Expected: ${it.expected.print().value}" },
            TestCase(prices = intArrayOf(3, 2, 3), expected = 3),
            TestCase(prices = intArrayOf(2, 2, 1, 1, 1, 2, 2), expected = 2),
        ) { (prices, expected) ->
            Solution169().majorityElement(prices) shouldBe expected
        }
    }
})