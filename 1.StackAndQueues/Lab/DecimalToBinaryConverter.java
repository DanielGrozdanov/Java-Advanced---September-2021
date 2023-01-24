package JavaAdvanced.StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int number = Integer.parseInt(scanner.nextLine());

        if(number == 0){
            System.out.println(number);
        }
        while (number != 0){
            stack.push(number % 2);
            number /= 2;
        }
        stack.forEach(System.out::print);
    }
}
