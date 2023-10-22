package exercise.easy.id1

class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hm = HashMap<Int, Int>()
        for ((index, num) in nums.withIndex()) {
            if (hm[num] == null && hm[target - num] == null) {
                hm[target - num] = index
            } else if (hm[num] != null) {
                return intArrayOf(hm.getValue(num), index)
            }
        }
        return IntArray(0)
    }
/*
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int, Int>(nums.size)
        for ((index, value) in nums.withIndex()) {
            hashMap.put(value, index)
        }
        for(index in 0..nums.size-1 ) {
            val num = target - nums[index]
            val result = hashMap.get(num)
            if (result != null && !result.equals(index)) {
                return intArrayOf(index, result)
            }
        }
        return IntArray(0)
    }
    */
}