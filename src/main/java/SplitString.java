public class SplitString {
    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s += "_";
        }
        String[] result = new String[s.length() / 2];
        int j = 0;
        for (int i = 0; i < s.length() - 1; i += 2) {

            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            sb.append(s.charAt(i + 1));

            result[j] = sb.toString();
            j++;
        }

        return result;
    }
}
