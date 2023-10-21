package exercise100.easy.id1

class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for ((index, num) in nums.withIndex()) {
            if (nums[index + 1] == nums.size) return IntArray(0)
            if (nums[index] + nums[index + 1] == target) return arrayOf(index, index + 1).toIntArray()
        }
        return IntArray(0)
    }
}