package exercise100.easy.id169

class Solution169 {
    fun majorityElement(nums: IntArray): Int {
        val hm = HashMap<Int, Int>()
        nums.forEach {
            val n = hm[it]
            if (n == null) hm[it] = 0
            if (n != null) hm[it] = n + 1
        }
        return hm.maxBy { n -> n.value }.key
    }

    /*



    */
}