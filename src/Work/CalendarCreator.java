package Work;

import java.util.Scanner;

public class CalendarCreator {

    static Scanner scan = new Scanner(System.in);

    //Заполнение объекта.
    public static Calendar creatCalendar(){
        return new Calendar(getName(), getTheTask(), getEndDate());
    }

    private static String getName (){
        System.out.println("Название задачи: ");
        return scan.nextLine();
    }

    private static String getTheTask (){
        System.out.println("Что предстоит сделать: ");
        return scan.nextLine();
    }

    private static String getEndDate (){
        System.out.println("Дата окончания: ");
        return scan.nextLine();
    }

}
