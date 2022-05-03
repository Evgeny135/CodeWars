package leetcode;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        String str = "";
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i)==s.charAt(i+1)){
                str+=s.charAt(i);
                break;
            }
            else if (s.charAt(i)!=s.charAt(i+1) && !str.contains(String.valueOf(s.charAt(i)))   ){
                str+=String.valueOf(s.charAt(i));

            }
        }
        return str.length();
    }
}
