package AlgorithmLv1

class sum_of_divisors {

}

fun solution (n: Int): Int {
    var sum = 0
    for (i in 1 ..n) {
        if (n % i == 0 ) {
            sum += i
        }
    }
    return sum
}

fun main () {

    println(solution(66))

}