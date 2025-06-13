package algorithmLv0;

/**
 * 문제 설명
 * 정수 배열 numbers 가 매개변수로 주어집니다. numbers 의 원소의 평균값을
 * return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 0 ≤ numbers의 원소 ≤ 1,000
 * 1 ≤ numbers의 길이 ≤ 100
 * 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
 *
 *
 입출력 예
 numbers	result
 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]	5.5
 [89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]	94.0
 */

public class ArrayAverageService {

    /** ver1 초기 코드 **/
    public double solution (int[] numbers) {

        double sum = 0;
        double arrLength = numbers.length;

        for(int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum / arrLength;

        return average;
    }
    /** 리팩토링 **/
    public double solution2(int[] numbers) {

        double sum =0;

        /** for each 문법
         * for ( 자료형 변수이름 : 배열이나 컬렉션 )
         * numbers 의 각 요소를 꺼내서 number 에 담겠다는 뜻
         * **/
        for (int number : numbers) {
            System.out.println("지금 number의 값은 " + number);
            sum += number;
        }

        return sum/ numbers.length;
    }

    public static void main(String[] args) {
        ArrayAverageService arrayAverageService = new ArrayAverageService();

        // Test cases
        System.out.println(arrayAverageService.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})); // Output: 5.5
        System.out.println(arrayAverageService.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99})); // Output: 94.

        System.out.println(arrayAverageService.solution2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})); // Output: 5.5
        System.out.println(arrayAverageService.solution2(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99})); // Output: 94.0
    }


}
