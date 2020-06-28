package Work;

import java.util.Scanner;

public class Task_2 {

    static Scanner scan1 = new Scanner(System.in);
    static Scanner scan2 = new Scanner(System.in);

    public static void main(String[] args) {

        int scanMonth = scan1.nextInt() - 1;
        int scanDay = scan2.nextInt();
        int months = 0;

        int[] arrayMonths = new int[12];
        arrayMonths[0] = 31;
        arrayMonths[1] = 28;
        arrayMonths[2] = 31;
        arrayMonths[3] = 30;
        arrayMonths[4] = 31;
        arrayMonths[5] = 30;
        arrayMonths[6] = 31;
        arrayMonths[7] = 31;
        arrayMonths[8] = 30;
        arrayMonths[9] = 31;
        arrayMonths[10] = 30;
        arrayMonths[11] = 31;


        for (int i = 0; i < arrayMonths.length; i++) {
            if (i == scanMonth) {
                months = i;
                System.out.println("Такой месяц есть.");

                break;
            }

        }

        if (scanDay <= arrayMonths[months]) {
            System.out.println("В этом месяце есть такой день.");


        }
    }
}
