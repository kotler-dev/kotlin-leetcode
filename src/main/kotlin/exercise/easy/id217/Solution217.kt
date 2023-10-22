package exercise.easy.id217

class Solution217 {
    fun containsDuplicate(nums: IntArray) = nums.size > nums.toSet().size

    /*

    fun containsDuplicate(nums: IntArray): Boolean {
        val hashSet = HashSet<Int>()
        nums.forEach {
            if (!hashSet.add(it))
                return true
        }
        return false
    }

    fun containsDuplicate(nums: IntArray): Boolean {
        if (nums.size < 2) return false
        val hs = HashSet<Int>()
        var end = nums.size - 1
        var index = 0
        var middle = nums.size / 2

        if (end % 2 == 0) {
            hs.add(nums[index])
            middle++
            index++
        }

        for (start in index..<end) {
            if (!hs.contains(nums[start])) hs.add(nums[start]) else return true
            if (!hs.contains(nums[end])) hs.add(nums[end]) else return true
            if (end == middle) return false
            end--
        }
        return false
    }

    fun containsDuplicate(nums: IntArray): Boolean {
        if (nums.size < 2) return false
        val hs = HashSet<Int>()
        var end = nums.size - 1
        val middle = nums.size / 2

        if (end >= 4) hs.add(nums[middle])

        for (start in 0..middle) {
            if (!hs.contains(nums[start])) hs.add(nums[start]) else return true
            if (!hs.contains(nums[end])) hs.add(nums[end]) else return true
            if (end == middle) return false
            end--
        }
        return false
    }

    fun containsDuplicate(nums: IntArray): Boolean {
        val hs = HashSet<Int>()
        var end = nums.size - 1
        var backStep = nums.size / 2
        var forwardStep = backStep + 1

        if ((backStep - 1) % 2 != 0) {
            hs.add(nums[backStep])
            backStep -= 1
            forwardStep += 1
        }

        for (start in 0..<nums.size / 2) {
            if (!hs.contains(nums[start])) hs.add(nums[start]) else return true
            if (!hs.contains(nums[end])) hs.add(nums[end--]) else return true
            if (nums.size >= 42) {
                if (!hs.contains(nums[backStep])) hs.add(nums[backStep--]) else return true
                if (!hs.contains(nums[forwardStep])) hs.add(nums[forwardStep++]) else return true
            }
        }
        return false
    }

    fun containsDuplicate(nums: IntArray): Boolean {
        val hs = HashSet<Int>()
        val first = 0
        var end = nums.size - 1
        var backStep = nums.size / 2 - 1
        var forwardStep = backStep + 1

        for (start in 0..nums.size / 2 - 1) {
            if (!hs.contains(nums[start])) hs.add(nums[start]) else return true
            if (!hs.contains(nums[end])) hs.add(nums[end]) else return true
            if (nums.size > 3) {
                if (!hs.contains(nums[backStep])) hs.add(nums[backStep]) else return true
                if (!hs.contains(nums[forwardStep])) hs.add(nums[forwardStep]) else return true
                if (backStep - 1 != start) backStep--
                if (forwardStep + 1 != end) forwardStep++
            }
            if (end - 1 != forwardStep) end--
        }
        return false
    }

    fun containsDuplicate(nums: IntArray): Boolean {
        var flag = false
        var dupl = -1
        for ((index, value) in nums.withIndex()) {
            if (flag == false) {
                if (index == nums.size - 1) return false
                flag = searchDuplicate(nums.slice(index+1..nums.size - 1), value)
            } else {
                return flag
            }
        }
        return false
    }

    fun searchDuplicate(arr: List<Int>, dupl: Int): Boolean {
        arr.forEach {
            if (it == dupl) {
                println("arr:$arr, dupl$dupl")
                return true
            }
        }
        return false
    }

    */
}