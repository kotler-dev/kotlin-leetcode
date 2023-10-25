package exercise.medium.id3

import io.kotest.assertions.print.print
import io.kotest.core.spec.style.FunSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

data class TestCase(val s: String, val expected: Int)

class Solution3Test : FunSpec({

    context(name = "shouldBe") {
        withData(
            nameFn = { "s: ${it.s.print().value}, expected: ${it.expected.print().value}" },
            TestCase("abcabcbb", expected = 3),
            TestCase("bbbbb", expected = 1),
            TestCase("pwwkew", expected = 3),
        ) { (s, expected) ->
            Solution3().lengthOfLongestSubstring(s) shouldBe expected
        }
    }
})
