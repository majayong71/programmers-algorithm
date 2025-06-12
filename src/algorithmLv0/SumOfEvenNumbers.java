package algorithmLv0;

/**
 * 정수 n이 주어질 때, n 이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요
 **/
public class SumOfEvenNumbers {

    public int solution (int n) {

        int lastEven;

        if ( n%2 == 0) {
            lastEven = n;
        } else {
            lastEven = n -1;
        }

        int count = lastEven / 2;
        int sum = count * ( 2 + lastEven ) / 2;

        return sum;
    }

    public static void main(String[] args) {
        SumOfEvenNumbers sumOfEvenNumbers = new SumOfEvenNumbers();

        System.out.println(sumOfEvenNumbers.solution(10));
        System.out.println(sumOfEvenNumbers.solution(8));
        System.out.println(sumOfEvenNumbers.solution(6));
        System.out.println(sumOfEvenNumbers.solution(4));
        System.out.println(sumOfEvenNumbers.solution(2));
    }

}
