package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int divisor = Integer.parseInt(scanner.nextLine());
        Collections.reverse(integerList);

        Predicate<Integer> predicate = number -> number % divisor == 0;
        integerList.removeIf(predicate);
        integerList.forEach(i -> System.out.print(i + " "));

    }
}
