package JavaAdvanced.StackAndQueues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(13);// adds element to the top of the stack
        stack.peek(); // returns the top element without removing it;
        stack.pop(); // returns the top element and removes it;

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(54);    //Adds element to the end of the queue;
        queue.peek(); // returns the front element in the queue without removing it.
        queue.poll();// returns the front element in the queue and removes it;


    }
}
