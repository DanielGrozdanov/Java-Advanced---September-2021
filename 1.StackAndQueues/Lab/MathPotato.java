package JavaAdvanced.StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String players = scanner.nextLine();
        int tosses = Integer.parseInt(scanner.nextLine());
        Arrays.stream(players.split("\\s+")).forEach(player -> queue.offer(player));
        int cycle = 1;

        while (queue.size() > 1) {
            for (int i = 1; i < tosses; i++) {
                queue.offer(queue.poll());
            }
            if(isPrime(cycle)){
                System.out.println("Prime " + queue.peek());
            }else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }
        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int number) {
        if(number == 0 || number == 1){
            return false;
        }
        int calc = number / 2;
        for (int i = 2; i <= calc; i++) {
            if (calc % i == 0) {
                return false;
            }
        }
        return true;
    }
}

