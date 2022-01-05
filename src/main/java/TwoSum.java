import java.util.ArrayList;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target)
    {
        int[] index = new int[2] ;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i]+numbers[j]==target){
                   index[0] = i;
                   index[1] = j;
                }
            }
        }
        return index;
    }

}
