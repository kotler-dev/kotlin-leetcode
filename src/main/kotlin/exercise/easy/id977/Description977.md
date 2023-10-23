[//]: # (Copyright [2023] [Anton Kotler kotler.developer@gmail.com] License MIT)

# Squares of a Sorted Array

Given an integer array `nums` sorted in non-decreasing order, return an array of the squares of each number sorted in
non-decreasing order.

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-61904f)

Example 1:

```
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
```

Example 2:

```
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
```

Constraints:

- `1 <= nums.length <= 104`
- `-104 <= nums[i] <= 104`
- `nums is sorted in non-decreasing order`

| ID  | Description               |           Solution           |                                       Test                                       | Difficulty |
|:---:|:--------------------------|:----------------------------:|:--------------------------------------------------------------------------------:|:----------:|
| 977 | Squares of a Sorted Array | [solution](./Solution977.kt) | [test](../../../../../../src/test/kotlin/exercise/easy/id977/Solution977Test.kt) |    Easy    |

:top: [Back to all topics](https://github.com/kotler-dev/kotlin-leetcode)
