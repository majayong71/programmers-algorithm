package algorithmLv0;

public class AngleClassifier {

    public int solution (int angle) {
        if (angle < 90) {
            return 1;
        } else if  (angle == 90) {
            return 2;
        } else if (angle < 180) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        AngleClassifier angleClassifier = new AngleClassifier();
        System.out.println(angleClassifier.solution(70));  // Output: 1
        System.out.println(angleClassifier.solution(90));  // Output: 2
        System.out.println(angleClassifier.solution(179)); // Output: 3
        System.out.println(angleClassifier.solution(181)); // Output: 4
    }
}
