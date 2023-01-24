package JavaAdvanced.StackAndQueues.Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean areBalanced = false;



        for (int i = 0; i < input.length(); i++) {
            char currentPar = input.charAt(i);
            if (currentPar == '(' || currentPar == '{' || currentPar == '[') {
                stack.push(currentPar);
            } else if (currentPar == ')' || currentPar == '}' || currentPar == ']') {
                if (stack.isEmpty()) {
                    areBalanced = false;
                    break;
                }

                char openedBracket = stack.pop();
                if (openedBracket == '(' && currentPar == ')') {
                    areBalanced = true;
                } else if (openedBracket == '{' && currentPar == '}') {
                    areBalanced = true;
                } else if (openedBracket == '[' && currentPar == ']') {
                    areBalanced = true;
                } else {
                    areBalanced = false;
                    break;
                }
            }
        }

        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
