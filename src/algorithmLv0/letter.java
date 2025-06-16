package algorithmLv0;

public class letter {

    public int solution(String message) {
       return message.length() *2;
    }

    public static void main(String[] args) {
        letter letter = new letter();

        // 테스트코드
        System.out.println(letter.solution("happy birthday!")); // Output: "happy birthday!"
        System.out.println(letter.solution("I love you~")); // Output: "hello world"
        System.out.println(letter.solution("java programming")); // Output: "java programming"
        System.out.println(letter.solution("algorithm")); // Output: "algorithm"
    }
}
