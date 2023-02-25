package JavaAdvanced.IteratorsAndComparators.Exercise.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> people = new ArrayList<>();

        while (!input.equals("END")) {
            String[] inputTokens = input.split(" ");
            String name = inputTokens[0];
            int age = Integer.parseInt(inputTokens[1]);
            String town = inputTokens[2];

            Person person = new Person(name, age, town);
            people.add(person);
            input = scanner.nextLine();
        }

        int index = Integer.parseInt(scanner.nextLine());
        Person person = people.get(index);
        people.remove(person);

        int same = 0;
        int different = 0;

        for (Person person1 : people) {
            if (person1.compareTo(person) == 0) {
                same++;
            } else {
                different++;
            }
        }
        people.add(person);

        System.out.printf("%d %d %d", ++same, different, people.size());
    }
}
