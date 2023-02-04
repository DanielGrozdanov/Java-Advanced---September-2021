package JavaAdvanced.SetsAndMapsAdvanced.Exercises;

import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int first = numbers[0];
        int second = numbers[1];

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < first; i++) {
            int input1 = Integer.parseInt(scanner.nextLine());
            firstSet.add(input1);
        }

        for (int i = 0; i < second; i++) {
            int input2 = Integer.parseInt(scanner.nextLine());
            secondSet.add(input2);
        }

        Set<Integer> theSame = new LinkedHashSet<>();

        for (Integer integer : firstSet) {
            for (Integer integer1 : secondSet) {
                if (Objects.equals(integer, integer1)) {
                    theSame.add(integer);
                }
            }
        }
        for (Integer integer : theSame) {
            System.out.print(integer + " ");
        }
    }
}
