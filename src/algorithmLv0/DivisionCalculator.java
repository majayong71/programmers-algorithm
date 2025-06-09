package algorithmLv0;

public class DivisionCalculator {

    public int solution (int num1, int num2) {

        double result = (double) num1 / num2 * 1000;

        return (int) result;
    }

    public static void main(String[] args) {
        DivisionCalculator divisionCalculator = new DivisionCalculator();
        double result = divisionCalculator.solution(1,16);
        System.out.println(result);
    }
}
