package exercise.easy.id977

class Solution977 {
    fun sortedSquares(nums: IntArray): IntArray {
        for (index in nums.indices) {
            nums[index] *= nums[index]
        }

        var flag: Boolean
        do {
            flag = false
            for (index in 1..<nums.size) {
                val box = nums[index - 1]
                if (nums[index - 1] > nums[index]) {
                    nums[index - 1] = nums[index]
                    nums[index] = box
                    flag = true
                }
            }
        } while (flag)
        return nums
    }

    /*

    fun sortedSquares(nums: IntArray): IntArray {
        return nums.toList().map { it * it }.sorted().toIntArray()
    }

    */
}