package Work.Homework_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("ajh");
        list.add("sda");
        list.add("vas");
        list.add("kjj");
        list.add("AML");

        list.stream()
                .map(String::toLowerCase)
                .filter(s -> s.charAt(0) == 'a')  // и так можно
                .filter(s -> s.startsWith("a"))   // и вот так можно
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }

}
