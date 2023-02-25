package JavaAdvanced.IteratorsAndComparators.Exercise.ImprovedListIterator;

import JavaAdvanced.IteratorsAndComparators.Exercise.ImprovedListIterator.LisIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();


        LisIterator<String> listIterator = null;

        while (!command.equals("END")) {
            String[] com = command.split(" ");
            switch (com[0]) {
                case "Create":
                    if (com.length > 1) {
                        listIterator = new LisIterator<>(Arrays.copyOfRange(com, 1, com.length));
                        break;
                    }
                    listIterator = new LisIterator<>();

                    break;
                case "Move":
                    System.out.println(listIterator.Move());
                    break;
                case "HasNext":
                    System.out.println(listIterator.HasNext());
                    break;
                case "PrintAll":
                    listIterator.printAll();
                    break;
                case "Print":
                    listIterator.Print();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
