package Work.Homework_9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task_9_2 {

    static Scanner scan = new Scanner(System.in);

    private static void addNum(ArrayList<Integer> list) {
        while (scan.hasNextInt()){
            int x = scan.nextInt();
            list.add(x);
        }
    }

    private static void printNum(ArrayList<Integer> list) {
        for (Integer num: list) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        System.out.println("Можешь вводить любое число, ты. Но помни: любое слово поломит метод сей!");

        ArrayList<Integer> list = new ArrayList<>();

        addNum(list);
        printNum(list);
    }
}
