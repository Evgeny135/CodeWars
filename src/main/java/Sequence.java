public class Sequence {
    public static int sequence(int[] arr) {
        int m = 0, a = 0, s = 0;
        for (int e : arr) {
            s += e;
            m = Math.min(s, m);
            a = Math.max(a, s - m);

        }
        return a;
    }
}
