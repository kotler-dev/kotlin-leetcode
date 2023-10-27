[//]: # (Copyright [2023] [Anton Kotler kotler.developer@gmail.com] License MIT)

# 3Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-548af7)

Given an integer array nums, return all the triples `[nums[i], nums[j]], nums[k]]`, such that `i != j`, `i != k`,
and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.  
Notice that the solution set must not contain duplicate triplets.

Example 1:

```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
```

Example 2:

```
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
```

Example 3:

```
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
```

Constraints:

- `3 <= nums.length <= 3000`
- `-10^5 <= nums[i] <= 10^5`

| ID | Description |          Solution           |                                       Test                                       | Difficulty |
|:--:|:------------|:---------------------------:|:--------------------------------------------------------------------------------:|:----------:|
| 15 | 3Sum        | [solution](./Solution15.kt) | [test](../../../../../../src/test/kotlin/exercise/medium/id15/Solution15Test.kt) |   Medium   |

:top: [Back to all topics](https://github.com/kotler-dev/kotlin-leetcode)
