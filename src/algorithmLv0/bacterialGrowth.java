package algorithmLv0;

/**
 *어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
 * 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때
 * t시간 후 세균의 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class bacterialGrowth {
    public int solution (int n, int t) {

        for(int i =0; i < t; i++) {
            n *= 2;
        }
        return n;
    }

    public static void main(String[] args) {
        bacterialGrowth bg = new bacterialGrowth();
        System.out.println(bg.solution(2, 10)); // Output: 1
        System.out.println(bg.solution(1, 1)); // Output: 2
        System.out.println(bg.solution(2, 3)); // Output: 16
        System.out.println(bg.solution(5, 2)); // Output: 20
    }
}
