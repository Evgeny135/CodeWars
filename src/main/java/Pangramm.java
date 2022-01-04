import java.util.ArrayList;
import java.util.Locale;

public class Pangramm {
    public boolean check(String sentence) {
        for(char i = 'а'; i <= 'я'; i++) {
            if(!sentence.toLowerCase().contains(String.valueOf(i))) {
                return false;
            }
        }
        return true;
    }
}
