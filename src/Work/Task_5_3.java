package Work;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;
import java.util.regex.Matcher;

public class Task_5_3 {

    static Scanner scan1 = new Scanner(System.in);
    static Scanner scan2 = new Scanner(System.in);

    public static void main(String[] args) {

        int ageInput = scan1.nextInt();
        String nameInput = scan2.nextLine();


        int age = ageInput;
        String name = nameInput;

        String form = "Hello %s %d лет.";
        System.out.println(String.format(form,name, age));


    }
}