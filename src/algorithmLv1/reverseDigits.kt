package AlgorithmLv1

class ReverseDigits {
    fun solution(n: Long): IntArray {
        return n.toString()
            .reversed()
            .map { it.toString().toInt() }
            .toIntArray()
    }
}

fun main() {
    val rd = ReverseDigits()
    val result = rd.solution(6587421)

    println(result.joinToString(", "))  // 출력: 5, 4, 3, 2, 1
}
