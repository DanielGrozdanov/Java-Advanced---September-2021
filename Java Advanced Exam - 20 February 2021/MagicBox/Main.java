package MagicBox;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).forEach(stack::push);


        int finalSum = 0;

        while (!queue.isEmpty() && !stack.isEmpty()) {

            int sum = stack.peek() + queue.peek();
            if (sum % 2 == 0) {
                finalSum += sum;
                stack.pop();
                queue.poll();
            } else {
                queue.offer(stack.pop());
            }
        }

        String emptyBox = queue.isEmpty() ? "First magic box is empty." : "Second magic box is empty.";
        String res = finalSum >= 90 ? " Wow, your prey was epic! Value: " : "Poor prey... Value: ";
        System.out.println(emptyBox);
        System.out.println(res + finalSum);
    }
}


