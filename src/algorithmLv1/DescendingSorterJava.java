package algorithmLv1;


/**
 * 문제 설명
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 *  이 문제는 입력받은 정수 n 을 큰 숫자대로 나열하면 되는 문제다.
 *  예를 들어 n이 118372면 873211을 리턴하면 된다.
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 * 입출력 예
 *          n	      return
 *          118372	  873211
 */
public class DescendingSorterJava {
    public long solution (long a) {
        // 1. 숫자를 문자열로 변환
        String str = Long.toString(a);

        // 2. 문자 배열로 변환
        char[] arr = str.toCharArray();
        /** char[] : 문자 하나하나를 원소로 갖는 문자 배열 타입 **/
        /** str.toCharArray() : 문자열을 문자 배열로 변환하는 메서드 **/

        // 3. 내림차순 정렬
        java.util.Arrays.sort(arr); // 오름차순 정렬

        // 4. 문자 배열 뒤집기 (내림차순으로 만들기)
        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse();

        // 5. 다시 Long 타입으로 변환하여 반환
        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {
        DescendingSorterJava descendingSorterJava = new DescendingSorterJava();
        System.out.println(descendingSorterJava.solution(118372));
        System.out.println(descendingSorterJava.solution(648169763));
    }
}

/**
 *    String str = Long.toString(a);
 *    이 가능한건 n은 이미 선언된 지역변수이고
 *    해당 메서드 블록 안에서 사용할 수 있는 스코프(scope) 내에 존재하기 때문에
 *
 *
 *
 */

