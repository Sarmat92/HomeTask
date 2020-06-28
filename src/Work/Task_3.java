package Work;

import java.util.Scanner;

public class Task_3 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("      Задача       ");
        System.out.println("Мир! Труд! ...!");
        System.out.println("Даётс три попытки. Чтоб сдаться введите EXIT.");
        System.out.println("Вставьте пропущенное слово: ");

        for (int i = 0; i < 3; i++) {

            String str = scan.nextLine();

            if (str.equalsIgnoreCase("Май"))
            {
                System.out.println("Верно!");
                break;
            }
            if (str.equalsIgnoreCase("exit"))
            {
                System.out.println("Фу таким быть...");
                break;
            }

        }
    }
}
