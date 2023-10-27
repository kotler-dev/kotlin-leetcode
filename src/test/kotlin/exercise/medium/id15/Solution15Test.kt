package exercise.medium.id15

import io.kotest.assertions.print.print
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.collections.shouldContainAll
import io.kotest.matchers.equals.shouldBeEqual
import io.kotest.matchers.shouldBe

data class TestCase(val nums: IntArray, val expected: List<List<Int>>)

class Solution15Test : FunSpec({

    context("shouldBe") {
        withData(
            nameFn = { "${it.nums.print().value}, expected: ${it.expected.print().value}" },
            TestCase(
                nums = intArrayOf(-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4), expected = listOf(
                    listOf(-4, 0, 4),
                    listOf(-4, 1, 3),
                    listOf(-3, -1, 4),
                    listOf(-3, 0, 3),
                    listOf(-3, 1, 2),
                    listOf(-2, -1, 3),
                    listOf(-2, 0, 2),
                    listOf(-1, -1, 2),
                    listOf(-1, 0, 1),
                )
            ),
            TestCase(
                nums = intArrayOf(3, 0, -2, -1, 1, 2),
                expected = listOf(listOf(-2, -1, 3), listOf(-2, 0, 2), listOf(-1, 0, 1))
            ),
            TestCase(nums = intArrayOf(-1, 0, 1, 2, -1, -4), expected = listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))),
            TestCase(nums = intArrayOf(0, 0, 0), expected = listOf(listOf(0, 0, 0))),
            TestCase(nums = intArrayOf(0, 0, 0, 0), expected = listOf(listOf(0, 0, 0))),
            TestCase(nums = intArrayOf(0, 1, 1), expected = emptyList()),
        ) { (nums, expected) ->
            Solution15().threeSum(nums) shouldContainAll expected
        }
    }
})
