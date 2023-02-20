package JavaAdvanced.FunctionalProgramming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String > printWith = p -> System.out.println("Sir " + p);
        Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList()).forEach(item -> printWith.accept(item));

    }
}
