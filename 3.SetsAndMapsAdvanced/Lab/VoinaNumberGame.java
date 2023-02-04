package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> playerOne = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> playerTwo = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;


//        if (playerOne.size() > playerTwo.size()) {
//            System.out.println("First player win!");
//            return;
//        } else if (playerTwo.size() > playerOne.size()) {
//            System.out.println("Second player win!");
//            return;
//        }
//

        while (rounds-- > 0 && !playerOne.isEmpty() && !playerTwo.isEmpty()) {

            int firstCard = playerOne.iterator().next();
            playerOne.remove(firstCard);

            int secondCard = playerTwo.iterator().next();
            playerTwo.remove(secondCard);

            if (firstCard > secondCard) {
                playerOne.add(firstCard);
                playerOne.add(secondCard);
            } else if (secondCard > firstCard) {
                playerTwo.add(firstCard);
                playerTwo.add(secondCard);
            }
        }
        if (playerOne.size() > playerTwo.size()) {
            System.out.println("First player win!");
        } else if (playerTwo.size() > playerOne.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
