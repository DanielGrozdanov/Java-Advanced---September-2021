package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterAge {
    public static class Person {

        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

//        List<Person> people = IntStream.range(0, number)
//                .mapToObj(ignored -> {
//            String[] split = scanner.nextLine().split(", ");
//            return new Person(split[0], Integer.parseInt(split[1]));
//        })
//                .toList();

        Supplier<Person> personSupplier = () -> {
            String[] split = scanner.nextLine().split(", ");
            return new Person(split[0], Integer.parseInt(split[1]));
        };

        List<Person> peopleList = IntStream.range(0, number).mapToObj(ignore -> personSupplier.get()).collect(Collectors.toList());

        String condition = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String[] format = scanner.nextLine().split(" ");


        Predicate<Person> filter = getFilter(condition, ageLimit);
        Consumer<Person> printer = getPrinter(format);

        peopleList
                .stream()
                .filter(filter)
                .forEach(printer);
    }

    public static Predicate<Person> getFilter(String condition, int age) {

        return condition.equals("older")
                ? p -> p.age >= age
                : p -> p.age <= age;
    }

    public static Consumer<Person> getPrinter(String[] format) {
        if (format.length == 2) {
            return p -> System.out.println(p.name + " - " + p.age);
        } else if (format[0].equals("name")) {
            return p -> System.out.println(p.name);
        }
        return p -> System.out.println(p.age);
    }
}
