package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> add = nums -> nums.stream().map(number -> number += 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiply = nums -> nums.stream().map(number -> number *= 2).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtract = nums -> nums.stream().map(number -> number -= 1).collect(Collectors.toList());
        Consumer<List<Integer>> printEm = number -> number.forEach(num -> System.out.print(num + " "));
//        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        Function<int[], int[]> add = num -> Arrays.stream(num).map(number -> number += 1).toArray();
//        Function<int[], int[]> multiply = num -> Arrays.stream(num).map(number -> number *= 2).toArray();
//        Function<int[], int[]> subtract = num -> Arrays.stream(num).map(number -> number -= 1).toArray();
//        Consumer<int[]> printEm = number -> Arrays.stream(number).forEach(each -> System.out.print(each + " "));

        String command = scanner.nextLine();


        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "print":
                    printEm.accept(numbers);
                    System.out.println();
                    break;

            }
            command = scanner.nextLine();
        }
    }
}
