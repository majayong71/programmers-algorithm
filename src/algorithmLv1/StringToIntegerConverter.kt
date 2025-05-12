package algorithmLv1

class StringToIntegerConverter {
    fun solution(s: String): Int {
        return s.toInt() // 타입변환 메서드.
    }
}

fun main() {
    val converter = StringToIntegerConverter()
    println(converter.solution("1234"))   // 1234
    println(converter.solution("-1234"))  // -1234
    println(converter.solution("+567"))   // 567
}
