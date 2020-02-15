import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Application{

    public static void main(String[] args) {


        final String regex = "(\\(|)07\\d\\d(\\)|)(-|\\s)\\d\\d\\d(\\s|)(|-)\\d\\d\\d";
        final String string = "0832 973213 ada 074o-123 312 0721 912 123 123 321 212 0732-222111(7480)-732213 0932-213-231(0732)-1321220749 223-102a0792-010-110";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        int index=1;
        while (matcher.find()) {
            System.out.println("Match number " + index++ + ": " + matcher.group(0));
        }
    }
}
