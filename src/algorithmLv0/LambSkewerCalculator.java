package algorithmLv0;

public class LambSkewerCalculator {

    public int solution(int n, int k) {
        // n: 양꼬치의 개수 1인분에 12,000원
        // k: 음료수의 개수 1개에 2,000원
        n *= 12000;
        k *= 2000;

        return n+k;
    }

    public int solution2(int n, int k) {
        // 10인분당 음료수 1개는 무료
        int serviceDrink = n / 10;

        // 실제 계산할 음료수 개수 = 주문한 k - 서비스 음료
        int paidDrink = k - serviceDrink;

        // 음료수가 음수가 될 수 있으므로 방어처리
        if (paidDrink < 0) {
            paidDrink = 0;
        }

        int total = (n * 12000) + (paidDrink * 2000);
        return total;
    }
}
