package exercise.easy.id977

import io.kotest.assertions.print.print
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.WithDataTestName
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

data class TestCase(
    val nums: IntArray,
    val expected: IntArray,
) : WithDataTestName {
    override fun dataTestName(): String = expected.print().value
}

class Solution977Test : FunSpec({
    context("shouldBe") {
        withData(
            nameFn = { "Input: ${it.nums.print().value}, Expected: ${it.expected.print().value}" },
            TestCase(nums = intArrayOf(-4, -1, 0, 3, 10), expected = intArrayOf(0, 1, 9, 16, 100)),
            TestCase(nums = intArrayOf(-7, -3, 2, 3, 11), expected = intArrayOf(4, 9, 9, 49, 121)),
        ) { (nums, expected) ->
            Solution977().sortedSquares(nums) shouldBe expected
        }
    }
})