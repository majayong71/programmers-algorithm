fun solution(n: Int): Int {
    var answer = 0

    for (i in 1..n) {         // 1부터 n까지 반복
        if (n % i == 0) {     // 약수인지 확인
            answer += i       // 약수라면 더하기
        }
    }

    return answer             // 최종 결과 리턴
}


