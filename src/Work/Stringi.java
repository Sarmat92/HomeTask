package Work;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringi {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 1000);
            String strNum = "" + random;

             //Pattern pat = Pattern.compile("\\d{2}\\s");
             //Matcher mach = pat.matcher(strNum);
            String str = strNum.replaceAll("^\\d{2}$", "-1");

            System.out.print(str + " ");
        }

    }
}
