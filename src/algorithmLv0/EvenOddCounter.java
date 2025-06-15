package algorithmLv0;

/**
 * 정수가 담긴 리스트 num_list 가 주어질 때, num_list 의 원소 중 짝수와 홀수의 개수를 담은 배열을
 * return 하도록 solution 함수를 완성해보세요.
 * 제한사항
 * 1 ≤ num_list 의 길이 ≤ 100
 * 0 ≤ num_list 의 원소 ≤ 1,000
 * 입출력 예
 * num_list	result
 * [1, 2, 3, 4, 5]	[2, 3]
 * [1, 3, 5, 7]	[0, 4]
 */

public class EvenOddCounter {
    public int[] solution(int[] num_list) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : num_list) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return new int[]{evenCount, oddCount};
    }

    public static void main(String[] args) {

        EvenOddCounter evenOddCounter = new EvenOddCounter();

        // 테스트코드
        evenOddCounter.solution(new int[]{1,2,3,4,5});
        System.out.println("짝수와 홀수의 개수: " +
                java.util.Arrays.toString(evenOddCounter.solution(new int[]{1,2,3,4,5}))); // Output: [2, 3]
        evenOddCounter.solution(new int[]{1,3,5,7});
        System.out.println("짝수와 홀수의 개수: " +
                java.util.Arrays.toString(evenOddCounter.solution(new int[]{1,3,5,7}))); // Output: [0, 4]
    }
}
