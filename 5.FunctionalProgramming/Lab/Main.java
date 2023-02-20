package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        List<Integer> abstractList =List.of(13,45,64,12,43);
        abstractList
                .stream()
                .mapToInt(e-> e * e)
                .forEach(System.out::println);

//        for (int i = 0; i < abstractList.size(); i++) {
//            System.out.println(Math.pow(abstractList.get(i),2));
//        }

    }
}
