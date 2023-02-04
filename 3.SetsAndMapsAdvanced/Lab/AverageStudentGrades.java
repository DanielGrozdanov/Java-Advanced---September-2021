package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> stringArrayListMap = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            stringArrayListMap.putIfAbsent(name, new ArrayList<>());
            ArrayList<Double> values = stringArrayListMap.get(name);
            values.add(grade);


        }

        stringArrayListMap.forEach((key,value) -> {
            System.out.printf("%s ->",key);
            value.forEach(el -> System.out.printf(" %.2f",el));
            System.out.printf(" (avg: %.2f)%n", value.stream().mapToDouble(a -> a).average().orElse(0));
        });
    }
}
