package algorithmLv0;

public class AgeCalculator {

    public int solution(int age) {

        int thisYear = 2022;
        return thisYear -= age - 1;
    }

    public static void main(String[] args) {

        AgeCalculator ageCalculator = new AgeCalculator();
        System.out.println(ageCalculator.solution(23));
    }
}
