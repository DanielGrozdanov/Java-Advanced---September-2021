package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   /*     String input = scanner.nextLine();

        Function<String, Integer> mutator = str -> str.split(", ").length;
        Function<String, Integer> sum = str -> Arrays.stream(str.split(", ")).mapToInt(Integer::parseInt).sum();

        System.out.println("Count = " + mutator.apply(input));
        System.out.println("Sum = " + sum.apply(input));*/

        String[] input = scanner.nextLine().split(", ");

        Function<String[], Integer> mutator = str -> str.length;
        Function<String[], Integer> sum = str -> Arrays.stream(input).mapToInt(Integer::parseInt).sum();

        System.out.println("Count = " + mutator.apply(input));
        System.out.println("Sum = " + sum.apply(input));
    }
}
