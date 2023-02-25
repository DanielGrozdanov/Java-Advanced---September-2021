package JavaAdvanced.DefiningClasses.Exercise.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person;
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        while (n-- > 0){
            String[] input = scanner.nextLine().split("\\s+");
            if(Integer.parseInt(input[1]) > 30){
                person = new Person(input[0],Integer.parseInt(input[1]));
                personList.add(person);
            }
        }
        personList.stream().sorted(Comparator.comparing(a -> a.name)).forEach(System.out::println);
    }
}
