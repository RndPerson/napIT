import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replacing {

    public static void main (String [] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String stroke = in.nextLine();

        System.out.print("Введите подстроку: ");
        String podstroke = in.nextLine();
        podstroke = podstroke + " ";

        Pattern pattern = Pattern.compile("\\[.+?\\] ");

        Matcher matcher = pattern.matcher(stroke);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();

        }
        System.out.println(matcher.replaceFirst(podstroke));
    }

}
