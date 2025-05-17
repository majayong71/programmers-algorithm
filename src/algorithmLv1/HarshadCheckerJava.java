package algorithmLv1;

/**
 *     문제 :
 *     자연수 x를 입력받아 x가 하샤드 수인지 아닌지
 *     검사하는 함수, solution을 완성해주세요.
 */

public class HarshadCheckerJava {
    public boolean solution (int a) {
        int sum = 0;
        int original = a;

        // 1. 각 자리수의 합을 구하기
        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }
        // 2. 원래 수가 자리수의 합으로 나누어 떨어지는지 확인

        return original % sum == 0; // 하샤드 수 = true, 아니면 false
    }
}
