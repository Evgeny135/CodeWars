import java.util.ArrayList;

public class DivisorsOfNumber {
    public long numberOfDivisors(int n) {
        long count = 0;
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            if (n%i==0){
                count++;
                number.add(i);
            }
        }

        return count;
    }
}
