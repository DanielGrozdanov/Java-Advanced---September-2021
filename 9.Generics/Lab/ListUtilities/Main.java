package JavaAdvanced.Generics.Lab.ListUtilities;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = List.of(22, 54, 64, 54, 23);
        List<String> strings = new ArrayList<>();
        strings.add("23");
        strings.add("5");
        strings.add("13");
        strings.add("53");
        strings.add("63");

        System.out.println(ListUtils.getMin(integers));
        strings.sort(String::compareTo);
        System.out.println(ListUtils.getMin(strings));

    }
}
