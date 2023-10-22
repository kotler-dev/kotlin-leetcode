package exercise.easy.id217

import io.kotest.assertions.print.print
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.WithDataTestName
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

data class TestCase(
    val nums: IntArray,
    val expected: Boolean,
) : WithDataTestName {
    override fun dataTestName(): String = expected.print().value
}

class Solution217Test : FunSpec({
    context("shouldBe") {
        withData(
            nameFn = { "Input: ${it.nums.print().value}, Expected: ${it.expected.print().value}" },
            TestCase(nums = intArrayOf(0), expected = false),
            TestCase(nums = intArrayOf(0, 0), expected = true),
            TestCase(nums = intArrayOf(3, 1), expected = false),
            TestCase(nums = intArrayOf(3, 2, 3), expected = true),
            TestCase(nums = intArrayOf(1, 2, 3, 1), expected = true),
            TestCase(nums = intArrayOf(1, 2, 3, 4), expected = false),
            TestCase(nums = intArrayOf(0, 1, 2, 3, 7, 4, 5, 42, 101, 6, 8, 7, 11, 12, 13, 14), expected = true),
            TestCase(nums = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2), expected = true),
            TestCase(nums = intArrayOf(13, 18, 22, 22), expected = true),
            TestCase(nums = intArrayOf(2, 14, 18, 22, 22), expected = true),
            TestCase(nums = intArrayOf(1, 5, -2, -4, 0), expected = false),
            TestCase(nums = intArrayOf(1000000000, 1000000000, 11), expected = true),
        ) { (prices, expected) ->
            Solution217().containsDuplicate(prices) shouldBe expected
        }
    }
})