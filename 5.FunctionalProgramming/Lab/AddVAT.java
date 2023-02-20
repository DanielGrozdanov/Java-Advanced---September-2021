package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        UnaryOperator<Double> vatCalc = value -> value * 1.20;

        System.out.println("Prices with VAT: ");
        List<Double> res = Arrays.stream(input).map(Double::parseDouble).map(vatCalc).collect(Collectors.toList());
        res.forEach(v -> System.out.printf("%.2f%n", v));
    }
}
