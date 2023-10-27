package exercise.medium.id15


class Solution15 {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.isEmpty() || nums.size < 3) return emptyList()

        val numList = mutableListOf<List<Int>>()
        var currentIndex = 0


        while (currentIndex < nums.size) {
            var shiftIndex = 0
            val list = mutableListOf<Int>(0, 0, 0)
            list[0] = nums[currentIndex]
            var step = 1

            while (shiftIndex < nums.size) {
                if (shiftIndex != currentIndex) {
                    list[step] = nums[shiftIndex]
                    step++
                    if (step == 3) {
                        println("current: ${currentIndex}, list3: ${list}")
//                        if ((list[0] != list[1]) && (list[0] != list[2]) && (list[1] != list[2])) {
                        if ((list[0] + list[1] + list[2] == 0)) {
                            list.sort()
                            if (list !in numList) numList.add(list.toList())
                        }
                        step = 1
                        shiftIndex--
                    }
                }
                shiftIndex++
            }
            currentIndex++
        }
        println(numList)

        return numList
    }
}