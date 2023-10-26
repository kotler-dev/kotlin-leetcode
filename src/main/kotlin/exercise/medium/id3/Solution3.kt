package exercise.medium.id3


class Solution3 {
    fun lengthOfLongestSubstring(s: String): Int {

        if (s.length == 0) return 0
        if (s.length == 1) return 1

        var longest: String = ""
        var maxLength: Int = 0
        var start = 0


        for (l in start..<s.length) {

            longest = ""
            if (s.length - 1 - l < maxLength) break

            for (i in l..<s.length) {
                if (s[i] !in longest) {
                    longest += s[i]
                    if (longest.length > maxLength) maxLength = longest.length
                } else {
                    if (longest.length > maxLength) maxLength = longest.length
                    println("s: ${s}, longest: ${longest}")
                    longest = "" + s[i]
                }
            }
            start += longest.length - 1
        }
        return maxLength
    }

/*

    // Output Limit Exceeded
    fun lengthOfLongestSubstring(s: String): Int {

        if (s.length == 0) return 0
        if (s.length == 1) return 1

        var longest: String = ""
        var maxLength: Int = 0

        for (l in 0..<s.length) {
            longest = ""
            for (i in l..<s.length) {
                if (s[i] !in longest) {
                    longest += s[i]
                    if (longest.length > maxLength) maxLength = longest.length
                } else {
                    if (longest.length > maxLength) maxLength = longest.length
                    println("s: ${s}, longest: ${longest}")
                    longest = "" + s[i]
                }
            }
        }
        return maxLength
    }

    fun lengthOfLongestSubstring(s: String): Int {

        if (s.length == 0) return 0
        if (s.length == 1) return 1

        var longest: String = ""
        var maxLength: Int = 0

        // прохождение по символу всей строки
        // символ + 1 != (входит в подстроку) увеличить макс длину вложенной строки
        // если встретился повторный символ, сброс подстроки

        for (index in 0..<s.length) {
            if (s[index] !in longest) {
                longest += s[index]
                if (longest.length > maxLength) maxLength = longest.length
            } else {
                if (longest.length > maxLength) maxLength = longest.length
                println("s: ${s}, longest: ${longest}")
                longest = "" + s[index]
            }
        }
        return maxLength
    }

*/
}