package JavaAdvanced.StackAndQueues.Exercise;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Solution 1
//        ArrayDeque<String> stack = new ArrayDeque<>();
//        String input = scanner.nextLine();
//        Arrays.stream(input.split("\\s+")).forEach(stack::push);
//        for (String s : stack) {
//            System.out.print(s + " ");
//        }
        //Solution 2
//        ArrayDeque<String> stack = new ArrayDeque<>();
//        String[] input = scanner.nextLine().split(" ");
//        for (String s : input) {
//            stack.push(s);
//        }
//        while (!stack.isEmpty()){
//            System.out.print(stack.pop() + " ");
//        }

        //Solution 3
        ArrayDeque<String> stack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(stack::push);
        stack.forEach(e -> System.out.print(e + " "));
    }
}
