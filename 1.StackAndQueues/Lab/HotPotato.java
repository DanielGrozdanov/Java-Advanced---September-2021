package JavaAdvanced.StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String players = scanner.nextLine();
        int tosses = Integer.parseInt(scanner.nextLine());
        Arrays.stream(players.split("\\s+")).forEach(player -> queue.offer(player));

       while (queue.size() > 1){
           for (int i = 1; i < tosses; i++) {
               queue.offer(queue.poll());
           }
           System.out.println("Removed " + queue.poll());
       }
        System.out.println("Last is " + queue.peek());
    }
}
