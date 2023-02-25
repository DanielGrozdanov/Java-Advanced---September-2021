package JavaAdvanced.IteratorsAndComparators.Exercise.ListyIterator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();


        ListIterator<String> listIterator = null;

        while (!command.equals("END")) {
            String[] com = command.split(" ");
            switch (com[0]) {
                case "Create":
                    if (com.length > 1) {
                        listIterator = new ListIterator<>(Arrays.copyOfRange(com, 1, com.length));
                        break;
                    }
                    listIterator = new ListIterator<>();

                    break;
                case "Move":
                    System.out.println(listIterator.Move());
                    break;
                case "HasNext":
                    System.out.println(listIterator.HasNext());
                    break;
                case "Print":
                    listIterator.Print();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
