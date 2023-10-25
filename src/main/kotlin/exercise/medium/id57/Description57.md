[//]: # (Copyright [2023] [Anton Kotler kotler.developer@gmail.com] License MIT)

# Insert Internal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-548af7)

You are given an array of non-overlapping intervals `intervals` where `intervals[i] = [start(i), end(i)]` represent the
start and the end of the `i'th` interval and `intervals` is sorted in ascending order by `start(i)`. You are also given
an interval `newInterval = [start, end]` that represents the start and end of another interval.

Insert `newInrerval` into `intervals` such that `intervals` is still sorted in ascending order by `start(i)`
and `intervals` still does not have any overlaping intervals (merged overlaping intervals if necessary).

Return `intervals` after the insertion.

Example 1:

```
Input: intervals = [[1,3], [6,9]], newIntervals = [2,5]
Output: [[1,5],[6,9]]
```

Example 2:

```
Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], target = 6
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaping with [3,5],[6,7],[8,10]
```

Example 3:

```
Input: intervals = [3,3], target = 6
Output: [0,1]
```

Constraints:

- `0 <= intervals.length <= 104`
- `intervals[i].length == 2`
- `0 <= starti <= endi <= 105`
- `intervals` is sorted by `start(i)` in ascending order
- newInterval.length == 2
- `0 <= start <= end <= 105`

| ID | Description     |          Solution           |                                       Test                                       | Difficulty |
|:--:|:----------------|:---------------------------:|:--------------------------------------------------------------------------------:|:----------:|
| 57 | Insert Interval | [solution](./Solution57.kt) | [test](../../../../../../src/test/kotlin/exercise/medium/id57/Solution57Test.kt) |    Easy    |

:top: [Back to all topics](https://github.com/kotler-dev/kotlin-leetcode)
