package exercise.easy.id283

class Solution283 {
    fun moveZeroes(nums: IntArray): Unit {
        if (nums.size >= 2) {
            var index = 0
            for (num in nums) {
                if (num != 0) nums[index++] = num
            }
            for (i in nums.size - 1 downTo index) {
                nums[i] = 0
            }
        }
    }

    /*

    fun moveZeroes(nums: IntArray): Unit {
        if (nums.size >= 2) {
            val box = IntArray(nums.size){0}
            var index = 0
            for (num in nums) {
                if (num != 0) box[index++] = num
            }
            for ((i, num) in box.withIndex()) {
                nums[i] = num
            }
        }
        println(nums.toList())
    }

    fun moveZeroes(nums: IntArray): Unit {
        if (nums.size > 2) {
            val hm = HashMap<Int, Int>()
            var key = 0

            for ((index, num) in nums.withIndex()) {
                if (num == 0) hm[key] = index
                if (num != 0 && hm[key] != null) {
                    nums[hm[key++]!!] = num
                    nums[index] = 0
                }
            }
        }
    }

    */
}