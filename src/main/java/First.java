import java.util.ArrayList;

public class First {
    public static String solution(String str) {
        String k = new StringBuilder(str).reverse().toString();
        System.out.println(k);
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        solution("her");
    }

}
