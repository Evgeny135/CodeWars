public class Braces {
    public boolean isValid(String braces) {
        String b = braces;
        for(int i=0;i<braces.length()/2;i++)
        {
            b = b.replaceAll("\\(\\)", "");
            b = b.replaceAll("\\[\\]", "");
            b = b.replaceAll("\\{\\}", "");
            if(b.length() == 0)
                return true;
        }
        return false;
    }
}
