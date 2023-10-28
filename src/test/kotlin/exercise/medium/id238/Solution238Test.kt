package exercise.medium.id238

import io.kotest.assertions.print.print
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

data class TestCase(val nums: IntArray, val expected: IntArray)

class Solution238Test : FunSpec({
    context("shouldBe") {
        withData(
            nameFn = { "nums: ${it.nums.print().value}, expected: ${it.expected.print().value}" },
            TestCase(nums = intArrayOf(1, 2, 3, 4), expected = intArrayOf(24, 12, 8, 6)),
            TestCase(nums = intArrayOf(-1, 1, 0, -3, 3), expected = intArrayOf(0, 0, 9, 0, 0)),
        ) { (nums, expected) ->
            Solution238().productExceptSelf(nums) shouldBe expected
        }
    }
})
