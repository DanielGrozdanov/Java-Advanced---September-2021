package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        BiFunction<List<Integer>, Integer, Boolean> checker = ((collection, number) -> {
            for (Integer integer : collection) {
                if (number % integer != 0) {
                    return false;
                }
            }
            return true;
        });

        for (int number = 1; number <= n; number++) {
            if(checker.apply(list,number)){
                System.out.print(number + " ");
            }
        }
    }
}
