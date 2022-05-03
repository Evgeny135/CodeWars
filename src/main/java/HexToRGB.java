public class HexToRGB {
    public static int[] hexStringToRGB(String hex) {
        int [] rgb = new int[3];
        rgb[0] = Integer.parseInt(hex.substring(1 , 3), 16 );
        rgb[1] = Integer.parseInt(hex.substring(3 , 5), 16);
        rgb[2] = Integer.parseInt(hex.substring(5 , 7), 16);
        return rgb;
    }
}
