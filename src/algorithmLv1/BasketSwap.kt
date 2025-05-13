package algorithmLv1

/**
 * 문제 요약
 *  - 바구니 N개 -> [1 , 2, 3 , .... N ] 이 들어 있다
 *  - M번 동안 : i,j 위치의 공을 서로 교환한다.
 *  최종적으로 바구니 안에 어떤 공이 있는지를 출력.
 */

/**
 * 접근 방식
 * 1. 배열을 생성해 [1,2, ... , N]으로 초기화.
 * 2. M개의 교환 명령을 반복하면서 배열의 i, j 위치의 값을 교환.
 * 3. 마지막 배열 상태를 출력.
 */

class BasketSwap {
    fun solution(n: Int, m: Int, swaps: List<Pair<Int, Int>>): List<Int> {
        val baskets = IntArray(n) { it + 1 } // [1, 2, ..., N]

        for ((i, j) in swaps) {
            val temp = baskets[i - 1]
            baskets[i - 1] = baskets[j - 1]
            baskets[j - 1] = temp
        }

        return baskets.toList()
    }
}

fun main () {
    val swaps = listOf(1 to 2, 3 to 4, 1 to 4, 2 to 2)
    val result = BasketSwap().solution(5, 4, swaps)
    println(result.joinToString(" ")) // 결과: 3 1 4 2 5

}