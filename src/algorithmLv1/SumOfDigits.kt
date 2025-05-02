package algorithmLv1

class SumOfDigits {

    fun solution(n: Int): Int {
        var num = n
        var sum = 0


        /**
         *  ex  987 / 10 => 98
         *      987 % 10 => 7
         */
        while (num > 0) {
            sum += num % 10      // num 의 마지막 자릿수를 sum 에 대입한다.
            num /= 10            // num 값을 10으로 나눈 값을 num 에 대입한다
        }
        return sum
    }
}

fun main() {
    val sumOfDigits = SumOfDigits ()
    val result = sumOfDigits.solution(1234567)
    println(result)
}