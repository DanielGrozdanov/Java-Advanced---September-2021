package JavaAdvanced.StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!input.equals("print")){
            if(input.equals("cancel")){
                System.out.println(queue.isEmpty() ? "Printer is on standby": "Canceled " + queue.poll());
            }else {
                queue.offer(input);
            }
            input = scanner.nextLine();
        }
        queue.forEach(System.out::println);
    }
}
