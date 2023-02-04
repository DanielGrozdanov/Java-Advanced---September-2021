package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> occurances = new LinkedHashMap<>();

        for (double value : input) {
            if (!occurances.containsKey(value)) {
                occurances.put(value, 1);
            } else {
                occurances.put(value, occurances.get(value) + 1);
            }
        }
        occurances.forEach((key, value) -> System.out.printf("%.1f -> %d%n", key,value));
    }
}
