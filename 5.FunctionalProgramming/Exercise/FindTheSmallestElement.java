package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> ints = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer> , Integer> func = num -> num.lastIndexOf(Collections.min(num));

        System.out.println(func.apply(ints));

//        Consumer<List<Integer>> check =  list -> {
//            int min = Collections.min(ints);
//            System.out.println(ints.lastIndexOf(min));
//        };
//
//        check.accept(ints);

    }
}
