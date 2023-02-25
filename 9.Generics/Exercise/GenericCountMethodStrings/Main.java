package JavaAdvanced.Generics.Exercise.GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<Double> list = new ArrayList<>();


        while (n-- > 0) {
            double input = Double.parseDouble(scanner.nextLine());
            list.add(input);
        }

        double compare = Double.parseDouble(scanner.nextLine());
        int count = countMethod(list,compare);
        System.out.println(count);
    }

    public static <T extends Comparable<T>> int countMethod(ArrayList<T> list, T element) {
        int counter = 0;
        for (T el : list) {
            if (el.compareTo(element) > 0) {
                counter++;
            }
        }
        return counter;
    }
}
