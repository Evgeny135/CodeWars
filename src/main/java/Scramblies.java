public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        for (int i = 0; i < str2.length(); i++) {
            String str = String.valueOf(str2.charAt(i));
            if (!str1.contains(str)) {
                return false;
            }
            str1 = str1.replaceFirst(str, "");
        }
        return true;
    }
}
