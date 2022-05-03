public class WhoLikeThat {
    public static String whoLikesIt(String... names) {

        if (names.length == 0) {
            return "no one likes this";
        } else if (names.length == 1) {
            return names[0] + " likes this";
        } else if (names.length == 2) {
            return names[0] + " and " + names[1] + " likes this";
        } else if (names.length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " likes this";
        } else if (names.length > 3) {
            int count = names.length-2;
            return names[0] + " ," + names[1] + " and" + count + "others like this";

        }
        return "";

    }
}
