import java.util.Locale;

public class Disemvowel {
    public static String disemvowel(String str) {

        str = str.replaceAll("[AEOUIaeoui]", "");

        return str;

    }

}
