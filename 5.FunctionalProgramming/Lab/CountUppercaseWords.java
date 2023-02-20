package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split("\\s+");

        Predicate<String> predicate =  str -> Character.isUpperCase(str.charAt(0));
        List<String> listed = Arrays.stream(strings).filter(strC -> predicate.test(strC)).collect(Collectors.toList());
        System.out.println(listed.size() + "\n" + String.join("\n", listed));

    }
}
