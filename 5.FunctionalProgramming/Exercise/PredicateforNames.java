package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateforNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<Integer> check = getIntegerPredicate(scanner);
        String[] input = scanner.nextLine().split(" ");

        List<String> collect = Arrays.stream(input).filter(each -> check.test(each.length())).toList();
        collect.forEach(System.out::println);

    }

    private static Predicate<Integer> getIntegerPredicate(Scanner scanner) {
        int numb = Integer.parseInt(scanner.nextLine());
        return len -> len <= numb;
    }
}
