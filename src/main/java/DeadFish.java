import java.util.ArrayList;

public class DeadFish {
    public static int[] parse(String data) {
        int count = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < data.length(); i++) {
            switch (data.charAt(i)) {
                case ('i'):
                    count++;
                    break;
                case ('d'):
                    count--;
                    break;
                case ('s'):
                    count = count * count;
                    break;
                case ('o'):
                   result.add(count);
            }



        }
        return result.stream().mapToInt(j->j).toArray();
    }
}
