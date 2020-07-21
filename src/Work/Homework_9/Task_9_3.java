package Work.Homework_9;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Task_9_3 {

    static Scanner scan = new Scanner(System.in);

    private static void users() {
        int user1 = 0;
        int user2 = 0;
    }

    private static int getStopNum() {
        System.out.println("Введите stop-число");
        return scan.nextInt();
    }

    private static void addQueue(Queue<Integer> q) {
        for (int i = 0; i <= 10; i++) {
            q.offer(i);
        }
    }

    private static void gameUsers(int stopNum, Queue<Integer> q) {
        int user1;
        int user2;
        for (int i = 0; i <= 10; i++) {

            user1 = q.remove().intValue();
            user2 = q.remove().intValue();

            if (user1 == stopNum | user2 == stopNum) {

                if (user1 == stopNum) {
                    System.out.println("Победитель " + "user1");
                } else System.out.println("Победитель " + "user2");
                break;
            }
        }
    }

    public static void main(String[] args) {

        users();

        int stopNum = getStopNum();

        Queue<Integer> q = new ArrayDeque<>();

        addQueue(q);

        gameUsers(stopNum, q);

    }
}
