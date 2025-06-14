package algorithmLv0;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

/**
 * 정수가 들어 있는 배열 num_list 가 매개변수로 주어집니다.
 * num_list 의 원소의 순서를 거꾸로 뒤집은 배열을 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ num_list 의 길이 ≤ 1,000
 * 0 ≤ num_list 의 원소 ≤ 1,000
 *
 * num_list	result
 * [1, 2, 3, 4, 5]	[5, 4, 3, 2, 1]
 * [1, 1, 1, 1, 1, 2]	[2, 1, 1, 1, 1, 1]
 * [1, 0, 1, 1, 1, 3, 5]	[5, 3, 1, 1, 1, 0, 1]
 */
public class ReverseArrayService {

    public int[] solution(int[] num_list) {

        int length = num_list.length;
        int [] reversed = new int [length];

        for(int i=0; i<length; i++) {
            reversed[i] = num_list[length - 1 - i];
        }

        return reversed;
    }

    // 리팩토링 했을 때
    public int[] solution2(int[] numList) {
        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());

        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }



    public static void main(String[] args) {
        ReverseArrayService reverseArrayService = new ReverseArrayService();

        // Test cases
        int[] result1 = reverseArrayService.solution(new int[]{1, 2, 3, 4, 5});
        int[] result2 = reverseArrayService.solution(new int[]{9,5,1,4,3,67,13,6,6,8,});
        int[] result3 = reverseArrayService.solution(new int[]{1, 0, 1, 1, 1, 3, 5});

        // Print results
        System.out.println(java.util.Arrays.toString(result1)); // Output: [5, 4, 3, 2, 1]
        System.out.println(java.util.Arrays.toString(result2)); // Output: [8, 6, 6, 13, 67, 3, 4, 1, 5, 9]
        System.out.println(java.util.Arrays.toString(result3)); // Output: [5, 3, 1, 1, 1, 0, 1]
    }
}
