[//]: # (Copyright [2023] [Anton Kotler kotler.developer@gmail.com] License MIT)

# Longest Substring Without Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-548af7)

Given a string `s`, find the length of the longest substring without repeating characters.

Example 1:

```
Input: s = "abcabcbb"
Output: 3
```

Example 2:

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is `b`, with the length of 1.
```

Example 3:

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is `wke`, with the length of 3.
Notice that the answer must be a substring, `pwke` is a subsequence and not a substring.
```

Constraints:

- `0 <= s.length <= 5 * 10^4`
- `s` consists of English letters, digits, symbols and spaces.

| ID | Description                                    |          Solution          |                                      Test                                      | Difficulty |
|:--:|:-----------------------------------------------|:--------------------------:|:------------------------------------------------------------------------------:|:----------:|
| 3  | Longest Substring Without Repeating Characters | [solution](./Solution3.kt) | [test](../../../../../../src/test/kotlin/exercise/medium/id3/Solution3Test.kt) |   Medium   |

:top: [Back to all topics](https://github.com/kotler-dev/kotlin-leetcode)
