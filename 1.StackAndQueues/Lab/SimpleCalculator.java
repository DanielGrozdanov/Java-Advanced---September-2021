package JavaAdvanced.StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String [] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            String token = input[i];
            if(Character.isDigit(token.charAt(0))){
                stack.push(Integer.parseInt(token));
            }else {
                int rightNumber = Integer.parseInt(input[++i]);
                int leftNumber = stack.peek();
                stack.push(rightNumber);

                int result = token.equals("+") ? leftNumber + rightNumber : leftNumber - rightNumber;
                stack.push(result);
            }
        }
        System.out.println(stack.peek());
    }
}
