package exercise.medium.id57

import kotlin.math.max
import kotlin.math.min

class Solution57 {
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {

        if (intervals.isEmpty()) return arrayOf(newInterval)
        if (newInterval.isEmpty()) return intervals

        println("[${newInterval[0]}, ${newInterval[1]}]")

        var start = newInterval[0]
        var end = newInterval[1]
        val left = 0
        val right = 1

        val merged = mutableListOf<IntArray>()
        var index = 0
        while (index < intervals.size && intervals[index][right] < start) {
            merged.add(intervals[index])
            index++
        }


        while (index < intervals.size && intervals[index][left] <= end) {
            start = min(start, intervals[index][left])
            end = max(end, intervals[index][right])
            index++
        }

        merged.add(intArrayOf(start, end))

        while (index < intervals.size) {
            merged.add(intervals[index])
            index++
        }

        return merged.toTypedArray()
    }
    /*

    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {

        if (intervals.isEmpty()) return arrayOf(newInterval)

        println("[${newInterval[0]}, ${newInterval[1]}]")

        val start = newInterval[0]
        val end = newInterval[1]
        val left = 0
        val right = 1

        val merged1 = mutableListOf<IntArray>()
        var index1 = 0
        while (index1 < intervals.size && intervals[index1][right] < start) {
            merged1.add(intervals[index1])
            index1++
        }

        if (intervals.size == 1) index1--

        val merged2 = mutableListOf<IntArray>()
        var index2 = intervals.size - 1
        while (index2 >= 0 && intervals[index2][left] > end) {
            merged2.add(intervals[index2])
            index2--
        }

        if (intervals.size > 1) {
            val min = min(start, intervals[index1][left])
            val max = max(end, intervals[index2][right])
            merged1.add(intArrayOf(min, max))
        }
        merged2.forEach { merged1.add(it) }

        return merged1.toTypedArray()
    }

    var index2 = index
    while (index2 < intervals.size) {
        if (intervals[index2][left] > end) {
            array.add(intervals[index2])
            index2++
        }
    }

    for ((index, arr) in intervals.withIndex()) {
        if (arr[right] < start) {
            array.add(arr)
        }
    }


    while (index < intervals.size ) {
        val value = intervals[index][right]
        if (value < start) {
            array.add(intervals[index])
        } else if (value < intervals[index][leftIndex]) {
            intervals[index][right] = end
            array.add(intervals[index])
            sliceStart = index
            break
        }
    }

    for (index in intervals.indices) {
        val value = intervals[index][rightIndex]
        if (value < start) {
            array.add(intervals[index])
        } else if (value < intervals[index][leftIndex]) {
            intervals[index][rightIndex] = end
            array.add(intervals[index])
            sliceStart = index
            break
        }
    }

    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {

        println("[${newInterval[0]}, ${newInterval[1]}]")

        val arrayFlatten = mutableListOf<Int>()
        for (index in intervals.indices) {
            arrayFlatten.add(intervals[index][0])
            arrayFlatten.add(intervals[index][1])
        }

        val arrayNonOverlapping = mutableListOf<Int>()
        for (index in 0..<arrayFlatten.size) {
            if (arrayFlatten[index] !in newInterval[0]..newInterval[1]) {
                println("==> ${arrayFlatten[index]}")
                arrayNonOverlapping.add(arrayFlatten[index])

            }
        }
        val arr = mutableListOf<IntArray>()
        for (index in 0..arrayNonOverlapping.size - 1 step 2) {
            arr.add(intArrayOf(arrayNonOverlapping[index], arrayNonOverlapping[index + 1]))
        }

        return arr.toTypedArray()
    }

    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        println("[${newInterval[0]}, ${newInterval[1]}]")
        val list = intervals.flatMap { it.asIterable() }.toMutableList()
        val start = newInterval[0]
        val end = newInterval[1]
        if (start !in list) list.add(start)
        if (end !in list) list.add(end)
        list.sort()
        var shiftLeft = 1
        var shiftRight = 1
        if (list.size % 2 != 0) shiftLeft--
        val part1: List<Int> = list.slice(0..<list.indexOf(start) - shiftLeft)
        if (part1.size % 2 == 0) shiftRight++
        val part2: List<Int> = list.slice(list.indexOf(end) + shiftRight..<list.size)
        val part3: List<Int> = listOf(part1, part2).flatten()
        val arr2 = mutableListOf<IntArray>()
        for (index in 0..part3.size - 1 step 2) {
            arr2.add(intArrayOf(part3[index], part3[index + 1]))
        }
        return arr2.toTypedArray()
    }

    */
}