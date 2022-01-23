public class Int32toIPv4 {
    public static String longToIP(long ip) {
        StringBuilder sb = new StringBuilder();
        long mask = (1<<8)-1;


        sb.append(ip>>>24 & mask);
        sb.append('.');
        sb.append(ip>>>16 & mask);
        sb.append('.');
        sb.append(ip>>>8 & mask);
        sb.append('.');
        sb.append(ip & mask);

        return sb.toString();
    }
}
