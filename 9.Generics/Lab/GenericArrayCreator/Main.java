package JavaAdvanced.Generics.Lab.GenericArrayCreator;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] integers = ArrayCreator.create(10, 13);

        String[] strings = ArrayCreator.create(String.class,3,"java");


        for (String string : strings) {
            System.out.println(string);
        }
        for (Integer ints : integers) {
            System.out.println(ints);
        }

    }
}
