package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> filtered = nums.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        Function<Stream<Integer>, String> mutator = x -> x.map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(mutator.apply(filtered.stream()));
        System.out.println(mutator.apply(filtered.stream().sorted()));
    }
}
