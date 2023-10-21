[//]: # (Copyright [2023] [Anton Kotler kotler.developer@gmail.com] License MIT)

# Two Sum

![GitHub license](https://img.shields.io/badge/Difficulty-Easy-61904f)

Given an array of integer `nums` and an integer `target`, return indices of the two numbers such that they add up to
`target`.  
You may assume that each input world have exactly one solution, and you may not the same element twice.  
You can return the answer in any order.

Example 1:

```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0,1].
```

Example 2:

```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

Example 3:

```
Input: nums = [3,3], target = 6
Output: [0,1]
```

Constraints:

- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Only one valid answer exist.

| Id | Description |          Solution          |                                      Test                                       | Difficulty |
|:--:|:------------|:--------------------------:|:-------------------------------------------------------------------------------:|:----------:|
| 1  | Two Sum     | [solution](./Solution1.kt) | [test](../../../../../../src/test/kotlin/exercise100/easy/id1/Solution1Test.kt) |    Easy    |

[:top: Back to all topics](../../../../../../../../../README.md)