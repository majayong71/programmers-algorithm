package algorithmLv0;

public class CharacterRemover {

    public String solution(String my_string, String letter) {

        String result = "";

        for (int i=0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                result += my_string.charAt(i);
            }
        }
        return result;
    }
}