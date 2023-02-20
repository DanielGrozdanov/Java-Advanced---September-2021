package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
//        Function<List<Integer>, Integer> func = Collections::min;
//        System.out.println(func.apply(numbers));

//            int[] ints = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//            int check = ints[0];
//            int minNumb = 0;
//
//
//        for (int i = 0; i < ints.length; i++) {
//            int anInt = ints[i];
//            if(check > anInt){
//                check = ints[i];
//                minNumb = i;
//            }
//        }
//
//        System.out.println(minNumb);

        List<Integer> integers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(integers);
        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> filter = number -> number % n == 0;
        integers.removeIf(filter);


    }
}
