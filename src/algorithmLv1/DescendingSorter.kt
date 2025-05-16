package algorithmLv1

class DescendingSorterKotlin {

    fun solution(n: Long): Long {
        // 1. 숫자를 문자열로 변환
        val str = n.toString()

        // 2. 문자 배열로 변환
        val arr = str.toCharArray()

        // 3. 내림차순 정렬
        arr.sort() // 오름차순 정렬

        // 4. 배열 뒤집기
        val reversedStr = arr.reversed().joinToString("")

        // 5. 문자열을 다시 Long 으로 변환
        return reversedStr.toLong()
    }
}

fun main() {
    val sorter = DescendingSorterKotlin()
    println(sorter.solution(118372))       // 873211
    println(sorter.solution(648169763))    // 987664331
}
