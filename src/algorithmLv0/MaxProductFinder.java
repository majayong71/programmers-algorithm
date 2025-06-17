package algorithmLv0;

public class MaxProductFinder {
    public int solution(int[] numbers) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int number : numbers) {
            if(number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number>max2){
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
