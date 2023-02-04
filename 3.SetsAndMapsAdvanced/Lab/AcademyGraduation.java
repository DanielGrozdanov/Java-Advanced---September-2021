package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<Double>> studentResults = new TreeMap<>();

        while (n-- > 0){
            String name = scanner.nextLine();
            double[] array = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble).toArray();

            studentResults.putIfAbsent(name,new ArrayList<>());
            for (int i = 0; i < array.length; i++) {
                studentResults.get(name).add(array[i]);
            }
        }

        studentResults.forEach((key,value) -> {
            double sum = 0;
            for (int i = 0; i < value.size(); i++) {
                sum += value.get(i);
            }
            double result = value.size() / sum;

            System.out.println(key + " is graduated with " + result);
        });

    }
}
