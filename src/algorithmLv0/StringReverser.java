package algorithmLv0;

public class StringReverser {
    public String solution(String my_string) {
        String result ="";

        for (int i=my_string.length()-1; i>=0; i--) {
            result += my_string.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        StringReverser stringReverser = new StringReverser();

        // 테스트코드
        System.out.println(stringReverser.solution("hello")); // Output: "olleh"
        System.out.println(stringReverser.solution("world")); // Output: "dlrow"
        System.out.println(stringReverser.solution("Java"));  // Output: "avaJ"
        System.out.println(stringReverser.solution("jaron"));  // Output: "avaJ"
        System.out.println(stringReverser.solution("bread"));  // Output: "avaJ"

    }
}
