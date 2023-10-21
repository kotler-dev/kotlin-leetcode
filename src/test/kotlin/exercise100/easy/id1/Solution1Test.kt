package exercise100.easy.id1

import io.kotest.assertions.print.print
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.WithDataTestName
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

data class TestCase(
    val nums: IntArray,
    val target: Int,
    val expected: IntArray,
) : WithDataTestName {
    override fun dataTestName(): String = expected.print().value
}

class Solution1Test : FunSpec({
    context("shouldBe") {
        withData(
            nameFn = { "Input: ${it.nums.print().value}, Expected: ${it.expected.print().value}" },
            TestCase(nums = intArrayOf(2, 7, 11, 15), target = 9, expected = intArrayOf(0, 1)),
            TestCase(nums = intArrayOf(3, 2, 4), target = 6, expected = intArrayOf(1, 2)),
            TestCase(nums = intArrayOf(3, 3), target = 6, expected = intArrayOf(0, 1)),
            TestCase(nums = intArrayOf(3, 2, 3), target = 6, expected = intArrayOf(0, 2)),
            TestCase(
                nums = intArrayOf(1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1),
                target = 11,
                expected = intArrayOf(5, 11)
            ),
        ) { (nums, target, expected) ->
            Solution1().twoSum(nums, target) shouldBe expected
        }
    }

    context("shouldNotBe") {
        withData(
            TestCase(nums = intArrayOf(2, 7, 11, 15), target = 9, expected = intArrayOf(1, 8)),
            TestCase(nums = intArrayOf(2, 7, 11, 15), target = 9, expected = intArrayOf(1, 42)),
        ) { (nums, target, expected) ->
            Solution1().twoSum(nums, target) shouldNotBe expected
        }
    }
})