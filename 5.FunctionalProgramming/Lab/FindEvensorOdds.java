package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindEvensorOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String condition = scanner.nextLine();


        printNumbersIn(numbers[0], numbers[1], condition.equals("even")
                ? n -> n % 2 == 0
                : n -> n % 2 == 1);
    }

    private static void printNumbersIn(int startIncl, int finishIncl, Predicate<Integer> predicate) {
        System.out.println(IntStream.rangeClosed(startIncl, finishIncl)
                .boxed()
                .filter(predicate).map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
