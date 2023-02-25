package JavaAdvanced.IteratorsAndComparators.Exercise.Froggy;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stonesArr = scanner.nextLine().split(", ");

        Lake lake = new Lake(Arrays.stream(stonesArr).map(Integer::parseInt).collect(Collectors.toList()));

        List<String> outPut = new ArrayList<>();

        Iterator<Integer> frog = lake.iterator();

        for (Integer integer : lake) {
            outPut.add(integer + "");
        }

        System.out.println(String.join(", ", outPut));
    }
}
