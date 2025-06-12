package algorithmLv0;

public class PizzaShare {
    public int solution (int n) {

        return  (n + 6) / 7;
    }

    public static void main(String[] args) {

        PizzaShare pizza = new PizzaShare();

        System.out.println(pizza.solution(1));
        System.out.println(pizza.solution(7));
        System.out.println(pizza.solution(8));
        System.out.println(pizza.solution(14));
        System.out.println(pizza.solution(15));
    }
}
