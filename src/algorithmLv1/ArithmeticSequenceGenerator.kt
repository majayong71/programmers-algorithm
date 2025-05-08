package algorithmLv1

class ArithmeticSequenceGenerator {

    fun solution(x: Int, n: Int): List<Long> {
        val result = mutableListOf<Long>()  // 결과를 저장할 리스트

        for (i in 1..n) {
            val value = x.toLong() * i
            result.add(value)
        }

        return result
    }
}


fun main() {

    val arithmeticSequenceGenerator = ArithmeticSequenceGenerator()
    val solution = arithmeticSequenceGenerator::solution

    val test1 = solution(2, 5)
    val test2 = solution(4, 3)
    val test3 = solution(-4, 2)
    val test4 = solution(12, 6)

    println("Test1: $test1")  // [2, 4, 6, 8, 10]
    println("Test2: $test2")  // [4, 8, 12]
    println("Test3: $test3")  // [-4, -8]
    println("Test4: $test4")  // [12, 24, 36, 48, 60, 72]
}


