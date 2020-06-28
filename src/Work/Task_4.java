package Work;

import java.util.Scanner;

public class Task_4 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 0;

        System.out.println("Введите число от 0 до 5");
        int num = scan.nextInt();

        if (num < 0 | num > 5) {
            System.out.println("Число должно быть от 0 до 5");
        } else for (int i = 0; i <= 100; i++) {
            int random = (int) (Math.random() * 6);

            count++;

            if (random == num) {
                System.out.println("Железо отгадало число " + num + " c " + count + "-ой " + "попытки.");
                break;
            }
        }
    }
}
