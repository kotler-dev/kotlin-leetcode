package exercise.medium.id238


class Solution238 {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        for (i in nums.indices) {
            var acc = 1
            for (j in nums.indices) {
                if (i != j) acc *= nums[j]
            }
            result[i] = acc
        }
        return result
    }
}