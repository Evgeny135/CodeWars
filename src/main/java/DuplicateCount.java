import java.util.HashSet;
public class DuplicateCount {
    public static int duplicateCount(String text) {
        HashSet<Character> duplicate = new HashSet<>();
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j) && i!=j) {
                    duplicate.add(text.charAt(i));

                }
            }
        }
        return duplicate.size();
    }
}
