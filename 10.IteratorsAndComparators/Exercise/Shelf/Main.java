package JavaAdvanced.IteratorsAndComparators.Exercise.Shelf;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Shelf shelf = new Shelf("Apple","Banana","Orange","Kiwi");
        Iterator<String> iterable = shelf.iterator();
        while (iterable.hasNext()){
            System.out.println(iterable.next());
        }
    }
}
