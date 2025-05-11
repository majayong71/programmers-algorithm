package algorithmLv1

class RemainderOneFinder {

    fun solution(n: Int): Int {
        for (x in 2 until n) { // x는 2부터 n-1까지 반복
            if (n % x == 1) {
                return x // 조건을 만족하는 가장 작은 x를 찾으면 바로 반환
            }
        }
        return -1 // 이론상 여기에 도달할 일은 없음 (문제에서 항상 답이 존재한다고 했으니까)
    }

}


fun main() {
    val finder = RemainderOneFinder()
    println(finder.solution(99))
    println(finder.solution(68))
}