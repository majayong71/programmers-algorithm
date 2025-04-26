package algorithmLv0

class `Divide integers` {

    class Solution {
        fun solution(num1: Int, num2: Int): Int {
            return num1 % num2
        }

        fun solution2(num1: Int, num2: Int): Int {
            return num1 % num2
        }
    }

    fun main() {
        val a = Solution()
        println(a.solution(3, 2))
        println(a.solution2(10, 5))
    }

}