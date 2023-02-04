package JavaAdvanced.SetsAndMapsAdvanced.Exercises;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        TreeSet<String> treeSet = new TreeSet<>();

        while (number-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            treeSet.addAll(Arrays.asList(input));
        }

        System.out.print(String.join(" ", treeSet));
    }
}
