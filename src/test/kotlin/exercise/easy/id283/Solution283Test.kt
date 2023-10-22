package exercise.easy.id283

import io.kotest.assertions.print.print
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.WithDataTestName
import io.kotest.datatest.withData
import io.kotest.matchers.equals.shouldBeEqual
import io.kotest.matchers.shouldBe

data class TestCase(
    val nums: IntArray,
    val expected: IntArray,
) : WithDataTestName {
    override fun dataTestName(): String = expected.print().value
}

class Solution283Test : FunSpec({
    context("shouldBe") {
        withData(
            nameFn = { "Input: ${it.nums.print().value}, Expected: ${it.expected.print().value}" },
            TestCase(nums = intArrayOf(0, 1, 0, 3, 12), expected = intArrayOf(1, 3, 12, 0, 0)),
            TestCase(nums = intArrayOf(0), expected = intArrayOf(0)),
            TestCase(nums = intArrayOf(0, 1), expected = intArrayOf(1, 0)),
        ) { (nums, expected) ->
            Solution283().moveZeroes(nums)
            nums.toList() shouldBeEqual expected.toList()
        }
    }
})