package Work;

import java.util.Scanner;

public class MassiB {
    /*
    Метод принимает два трёхзначных числа. Если последние значения равны, вывести true.
    Если нет, вывести false.
     */


    static Scanner scan1 = new Scanner(System.in);
    static Scanner scan2 = new Scanner(System.in);

    private static void compare(int num1, int num2) {
        String num1String = ""+num1;
        String num2String = ""+num2;

        char a = num1String.charAt(2);
        char b = num2String.charAt(2);

        if (a == b){
            System.out.println("true");
        }else System.out.println("false");
    }

    public static void main(String[] args) {

        int num1 = scan1.nextInt();
        int num2 = scan2.nextInt();

        compare(num1, num2);
    }
}
