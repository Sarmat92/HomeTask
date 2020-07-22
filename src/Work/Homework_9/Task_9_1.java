package Work.Homework_9;

import java.util.*;

public class Task_9_1 {


    public static void main(String[] args) {

        String str = "cabcac";
        String[] arrayStr = str.split("");

        HashMap<String,Integer>map = new HashMap<>();

        for (int i = 0; i <arrayStr.length ; i++) {
           int count = 0;
            for (int j = 0; j <arrayStr.length ; j++) {
                if (arrayStr[i].equalsIgnoreCase(arrayStr[j])){
                    count++;
                }
            }
            map.put(arrayStr[i],count);
        }
        System.out.println(map);

    }
}

