package JavaAdvanced.IteratorsAndComparators.Exercise.StrategyPattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<Person> nameTreeSet = new TreeSet<>(new NameComparator());
        TreeSet<Person> ageTreeSet = new TreeSet<>(new AgeComparator());


        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0){
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            Person person = new Person(split[0],Integer.parseInt(split[1]));
            nameTreeSet.add(person);
            ageTreeSet.add(person);
        }

        for (Person person : nameTreeSet) {
            System.out.println(person);
        }
        for (Person person : ageTreeSet) {
            System.out.println(person);
        }
    }
}
