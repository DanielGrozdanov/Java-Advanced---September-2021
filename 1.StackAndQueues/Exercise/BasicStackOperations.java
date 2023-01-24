package JavaAdvanced.StackAndQueues.Exercise;


import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int numOfElementsAdd = scanner.nextInt(); // N representing the number of elements to push into the stack
        int numbOfElementsToRemove = scanner.nextInt();// S representing the number of elements to pop from the stack
        int checkNum = scanner.nextInt(); // X check if present;

        for (int i = 1; i <= numOfElementsAdd; i++) {
            stack.push(scanner.nextInt());
        }
        for (int i = 1; i <= numbOfElementsToRemove; i++) {
            stack.pop();
        }

       if(stack.contains(checkNum)){
           System.out.println(true);
       }else {
           if (stack.isEmpty()){
               System.out.println(0);
           }else {
               System.out.println(getMinElement(stack));
           }
       }
    }


    private static int getMinElement(ArrayDeque<Integer> stack) {
        int minElement = stack.peek();
        while (!stack.isEmpty()){
            int number = stack.pop();
            if(number < minElement){
                minElement = number;
            }
        }

        return minElement;
    }
}
