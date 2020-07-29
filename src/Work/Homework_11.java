package Work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework_11 {

    static Scanner scan = new Scanner(System.in);

    private static int calc(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    public static void main(String[] args) {

        boolean repeat = true;

        do {

            try {

                int firstNum = Integer.parseInt(scan.next());
                int secondNum = Integer.parseInt(scan.next());

                System.out.println(calc(firstNum, secondNum));

                repeat = false;

            } catch (ArithmeticException e) {
                System.out.println("Нельзя делить на ноль, лох!" + '\n' + e);
            } catch (NumberFormatException e) {
                System.out.println("Вводи только цифры, рукажоп!" + '\n' + e);
            } catch (InputMismatchException e) {
                System.out.println("Вводим только цифры! " + '\n' + e);

            } finally {
                System.out.println("Всегда будет выполняться!");
            }
        } while (repeat);
    }

}
