package Work;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task_5_4 {

    public static void main(String[] args) {

        String str = "разделяем строку на слова на строку разделяем на";
        String[] arrayStr = str.split("\\s");

        /*
        Сделал через Мар, но мы его еще не разбирали. В целом, ничего сложного нет,
        но есть вопросы. Ниже обыкновенный вариант!
         */

       /* Map<String, Integer> mp = new HashMap<String, Integer>();
        int count = 0;

        for (int i = 0; i < arrayStr.length; i++) {
            count = 0;
            for (int j = 0; j < arrayStr.length; j++) {
                if (arrayStr[i].equalsIgnoreCase(arrayStr[j])) {
                    count++;
                }
            }
            mp.put(arrayStr[i], count);
        }
        System.out.println(mp);

        */


        /*
        Почти получается, но чего-то не хватает!!!
         */

        int count = 0;
        for (int i = 0; i < arrayStr.length; i++) {
            count = 0;
            for (int j = 0; j < arrayStr.length; j++) {
                if (arrayStr[i].equalsIgnoreCase(arrayStr[j])) {
                    count++;
                }
            }
            System.out.println(arrayStr[i] + " " + count);
        }


    }
}
