[//]: # (Copyright [2023] [Anton Kotler kotler.developer@gmail.com] License MIT)

# Move Zeroes

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero
elements.  
Note that you must do this in-place without making a copy of the array.

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-61904f)

Example 1:

```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
```

Example 2:

```
Input: nums = [0]
Output: [0]
```

Example 3:

```
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
```

Constraints:

- `1 <= nums.length <= 10^4`
- `-2^31 <= nums[i] <= 2^31 - 1`

| ID  | Description |           Solution           |                                       Test                                       | Difficulty |
|:---:|:------------|:----------------------------:|:--------------------------------------------------------------------------------:|:----------:|
| 283 | Move Zeroes | [solution](./Solution283.kt) | [test](../../../../../../src/test/kotlin/exercise/easy/id283/Solution283Test.kt) |    Easy    |

:top: [Back to all topics](https://github.com/kotler-dev/kotlin-leetcode)
