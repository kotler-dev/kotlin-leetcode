[//]: # (Copyright [2023] [Anton Kotler kotler.developer@gmail.com] License MIT)

# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-61904f)

Given an array `nums` of size `n`, return the majority element.  
The majority element is the element that appears more than `|n / 2|` times.  
You may assume that the majority element always exists in the array.

Example 1:

```
Input: nums = [3,2,3]
Output: 3
```

Example 2:

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2
```

Constraints:

- `n == nums.length`
- `1 <= n <= 5 * 10^4`
- `-10^9 <= nums[i] <= 10^9`

Follow-up: Could you solve the problem in linear time and in `O(1)` space?

| ID  | Description      |           Solution           |                                        Test                                         | Difficulty |
|:---:|:-----------------|:----------------------------:|:-----------------------------------------------------------------------------------:|:----------:|
| 169 | Majority Element | [solution](./Solution169.kt) | [test](../../../../../test/kotlin/exercise/easy/id169/Solution169Test.kt) |    Easy    |

:top: [Back to all topics](https://github.com/kotler-dev/kotlin-leetcode)
