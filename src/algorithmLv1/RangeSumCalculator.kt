package algorithmLv1

class RangeSumCalculator {

    fun solution(a: Int, b: Int): Long {
        val min = minOf(a, b).toLong()
        val max = maxOf(a, b).toLong()
        val count = max - min + 1
        return (min + max) * count / 2
    }
}

fun main() {
    val calculator = RangeSumCalculator()
    println(calculator.solution(3, 5)) // 12
    println(calculator.solution(3, 3)) // 3
    println(calculator.solution(1, 10)) // 55
}
