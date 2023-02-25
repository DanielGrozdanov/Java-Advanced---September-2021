package JavaAdvanced.Generics.Exercise.GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int n = Integer.parseInt(scanner.nextLine());
//        List<String> stringList = new ArrayList<>();
//        while (n-- > 0){
//            String input = scanner.nextLine();
//            stringList.add(input);
//        }
//        String[] input = scanner.nextLine().split(" ");
//        Box<String> boxWithSwap = new Box<>(stringList);
//        boxWithSwap.swap(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
//        System.out.println(boxWithSwap.toString());

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> stringList = new ArrayList<>();
        while (n-- > 0){
            int input = Integer.parseInt(scanner.nextLine());
            stringList.add(input);
        }
        String[] input = scanner.nextLine().split(" ");
        swap(stringList,Integer.parseInt(input[0]),Integer.parseInt(input[1]));
        Box<Integer> box = new Box<>(stringList);
        System.out.println(box.toString());
    }

    public static <T> void swap(List<T> list, int index1, int index2) {
        T temp = list.get(index1);
        T temp2 = list.get(index2);
        list.set(index2,temp);
        list.set(index1,temp2);

    }
}
