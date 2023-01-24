package JavaAdvanced.StackAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int numOfElementsAdd = scanner.nextInt(); // N representing the number of elements to push into the stack
        int numbOfElementsToRemove = scanner.nextInt();// S representing the number of elements to pop from the stack
        int checkNum = scanner.nextInt(); // X check if present;

        for (int i = 1; i <= numOfElementsAdd; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 1; i <= numbOfElementsToRemove; i++) {
            queue.poll();
        }

        if (queue.contains(checkNum)) {
            System.out.println(true);
        } else {
            if (queue.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
