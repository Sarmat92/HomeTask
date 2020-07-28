package Work.Homework_13;

import java.util.Optional;

public class Task_3 {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Dimoooon");
        System.out.println("Простой вызов name: " + name);
        System.out.println("Вызов через name.get(): " + name.get());

        System.out.print("Вызов черз stream: ");
        name.stream().forEach(System.out::println);

        if (name.isPresent()) {
            System.out.println("С использованием isPresent : " + name);
        }

        name.ifPresent(s -> System.out.println("С использованием ifPresent : " + s));

        Optional<String> name1 = Optional.of("John");
        System.out.println(name1.orElse("blank")); //вернёт John

        Optional<Object> empty = Optional.empty();
        System.out.println(empty.orElse("blank")); //вернёт blank

        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Создаёт пустой Optional : " + emptyOptional);

    }
}
