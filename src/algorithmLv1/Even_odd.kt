package algorithmLv1

class EvenOdd {
    fun solution(num: Int): String {
        val isEven = num % 2 ==0
        return if(isEven) "짝수" else "홀수"
    }
}

fun main() {

    val obj = EvenOdd()
    println(obj.solution(12))
}

