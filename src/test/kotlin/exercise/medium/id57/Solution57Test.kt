package exercise.medium.id57

import io.kotest.assertions.print.print
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.WithDataTestName
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

data class TestCase(
    val intervals: Array<IntArray>,
    val newInterval: IntArray,
    val expected: Array<IntArray>,
) : WithDataTestName {
    override fun dataTestName(): String = expected.print().value
}

class Solution57Test : FunSpec({
    context("shouldBe") {
        withData(
            nameFn = { "Input: ${it.intervals.print().value}, newInterval: ${it.newInterval.print().value}, Expected: ${it.expected.print().value}" },
            TestCase(
                intervals = arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(3, 5),
                    intArrayOf(6, 7),
                    intArrayOf(8, 10),
                    intArrayOf(12, 16)
                ),
                newInterval = intArrayOf(4, 8),
                expected = arrayOf(intArrayOf(1, 2), intArrayOf(3, 10), intArrayOf(12, 16))
            ),
            TestCase(
                intervals = arrayOf(intArrayOf(1, 3), intArrayOf(6, 9)),
                newInterval = intArrayOf(2, 5),
                expected = arrayOf(intArrayOf(1, 5), intArrayOf(6, 9))
            ),
            TestCase(
                intervals = arrayOf(),
                newInterval = intArrayOf(2, 5),
                expected = arrayOf(intArrayOf(2, 5))
            ),
            TestCase(
                intervals = arrayOf(intArrayOf(1, 5)),
                newInterval = intArrayOf(6, 8),
                expected = arrayOf(intArrayOf(1, 5), intArrayOf(6, 8))
            ),
            TestCase(
                intervals = arrayOf(intArrayOf(1, 5)),
                newInterval = intArrayOf(2, 3),
                expected = arrayOf(intArrayOf(1, 5))
            )
        ) { (intervals, newInterval, expected) ->
            Solution57().insert(intervals, newInterval) shouldBe expected
        }
    }
})
