package algorithmLv1

class AverageCalculator {

}

fun solution(arr: IntArray): Double {
    val sum = arr.sum ()
    return sum.toDouble() / arr.size
}



fun main() {
    val input1 = intArrayOf(1,2,3,4)
    val input2 = intArrayOf(5,5)

    println(solution(input1))
    println(solution(input2))

}