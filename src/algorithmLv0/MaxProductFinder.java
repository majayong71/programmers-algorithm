package algorithmLv0;

public class MaxProductFinder {
    public int solution(int[] numbers) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int number : numbers) { // numbers 배열의 각 요소를 순회한다.
            if(number > max1) { // 현재 number가 max1보다 크면, max1을 max2로 옮기고 max1을 갱신한다.
                max2 = max1; // 현재 max1보다 큰 수가 나오면, 이전의 max1은 max2로 이동한다.
                max1 = number; // 그리고 현재 수를 max1으로 갱신한다.
            } else if (number>max2){ // 현재 number가 max1보다 크지 않지만 max2보다 크면, max2를 갱신한다.
                max2 = number; //max1은 넘지 못하지만 max2는 갱신될 수 있다.
            }
        }

        return max1 * max2;
    }

    public static void main(String[] args) {

        int [] asd = {1,2,3,4,5};
        MaxProductFinder maxProductFinder = new MaxProductFinder();

        System.out.println(maxProductFinder.solution(asd));
    }
}
