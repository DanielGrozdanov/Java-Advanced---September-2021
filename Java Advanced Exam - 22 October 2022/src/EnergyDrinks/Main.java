package EnergyDrinks;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> caffeineStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).forEach(caffeineStack::push);

        ArrayDeque<Integer> energyQueue = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        int total = 0;
        int caffeineLimit = 300;

        while (!caffeineStack.isEmpty() && !energyQueue.isEmpty()) {


            int sum = caffeineStack.peek() * energyQueue.peek();

            if (sum + total <= caffeineLimit) {
                total += sum;
                caffeineStack.pop();
                energyQueue.poll();
            } else {
                caffeineStack.pop();
                Integer poll = energyQueue.poll();
                energyQueue.offer(poll);
                if(total >= 30){
                      total -= 30;
                  }
            }
        }
        if (energyQueue.isEmpty()) {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        } else {
            System.out.printf("Drinks left: %s%n", String.join(", ", Arrays.asList(energyQueue.toString().
                    substring(1, energyQueue.toString().length() - 1))));
        }
        System.out.printf("Stamat is going to sleep with %d mg caffeine.", total);
    }
}
