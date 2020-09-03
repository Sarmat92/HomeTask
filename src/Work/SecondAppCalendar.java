package Work;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondAppCalendar {

    static Scanner scanner = new Scanner(System.in);
    public static final String FILE_NAME = "Second_Files.txt";
    private static final String STOP = "stop";
    public static Map<Integer, Calendar> mapCalendar = new HashMap<>();

    public static void main(String[] args) {

        String next;
        do {
            System.out.println("Добавить задание - 1\nУдалить задание - 2");
            System.out.println("Получить список имющихся задач - 3");
            int numWant = scanner.nextInt();
            switch (numWant) {
                case 1:
                    addTask();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    readTask();
                    break;
            }
            System.out.println("Для завершения - stop\nЧтоб вернуться в начало, нажмите любую кнопку.");
            next = scanner.nextLine();
        }
        while (!next.equals(STOP));
    }

    private static void addTask() {
        int count = 1;
        String stop;

        do {
            Calendar calendar = CalendarCreator.creatCalendar();
            mapCalendar.put(count, calendar);
            saveTask(mapCalendar);
            readTask();

            System.out.println("Продолжаем?");
            stop = scanner.nextLine();
            count++;

            readTask();
        }

        while (!stop.equals(STOP));
        System.out.println("Список заданий.");
    }

    private static void delete() {
        System.out.println("Для удаления укажи номер задачи");
        int deleteTask = scanner.nextInt();
        mapCalendar.remove(deleteTask);
        saveTask( mapCalendar);
        readTask();
    }

    //Прочитали
    private static void readTask() {
        try (FileInputStream fileInput = new FileInputStream(FILE_NAME);
             ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {

            Object object = objectInput.readObject();
            Map<Integer, Calendar> calendarMap = null;
            if (object instanceof Map) {
                calendarMap = (Map) object;
            }
            for (Map.Entry<Integer, Calendar> map : calendarMap.entrySet()) {
                System.out.println("Task is: " + map);
            }
        } catch (Exception e) {
            System.out.println("Фигня какая-то " + e);
        }
    }

    // Записали
    private static void saveTask(Map<Integer, Calendar> mapCalendar) {
        try (FileOutputStream fileOut = new FileOutputStream(FILE_NAME);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(mapCalendar);

        } catch (Exception e) {
            System.out.println("Фигня какая-то " + e);
        }
    }
}
