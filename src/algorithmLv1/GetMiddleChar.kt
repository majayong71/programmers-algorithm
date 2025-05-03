package algorithmLv1

class GetMiddleChar {
    fun solution (n : String) : String {

        var text = ""

        // 짝수일 때 를 표현한 조건문 2로 나누고 0일 경우는 짝수니까.
        if (n.length % 2 == 0 ) {
            text = n.substring(n.length / 2 - 1, n.length / 2 + 1)
        } else {
            text = n[n.length / 2].toString()
        }
        return text
        /**
         * 10 -> 5
         * 12 -> 6
         * 14 -> 7
         */
    }
}

fun main() {

    var getMiddleChar = GetMiddleChar ()
    println(getMiddleChar.solution("abcdef")) // "cd"
    println(getMiddleChar.solution("abcde")) // "c"

}