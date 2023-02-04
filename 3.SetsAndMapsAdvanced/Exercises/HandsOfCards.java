package JavaAdvanced.SetsAndMapsAdvanced.Exercises;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Set<String>> playersWithCards = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("JOKER")) {
            String name = input.split(": ")[0];
            String cardsStr = input.split(": ")[1];
            String[] cardsArray = cardsStr.split(",\\s+");
            Set<String> cards = new HashSet<>();
            Collections.addAll(cards, cardsArray);


            if (playersWithCards.containsKey(name)) {
                Set<String> currentCards = playersWithCards.get(name);
                currentCards.addAll(cards);
                playersWithCards.put(name, currentCards);
            } else {
                playersWithCards.put(name, cards);
            }

            input = scanner.nextLine();
        }
        playersWithCards.entrySet().forEach(entry -> {
            String name = entry.getKey();
            int points = getPoints(entry.getValue());
            System.out.printf("%s: %d%n", name, points);
        });
    }

    private static int getPoints(Set<String> value) {
        Map<Character, Integer> pointsMap = getCardValue();

        int sumCards = 0;
        for (String card : value) {
            int points = 0;

            if (card.contains("10")) {
                char type = card.charAt(2);
                points = 10 * pointsMap.get(type);
            } else {
                char number = card.charAt(0);
                char type = card.charAt(1);
                points = pointsMap.get(number) * pointsMap.get(type);
            }
            sumCards += points;
        }
        return sumCards;
    }

    private static Map<Character, Integer> getCardValue() {
        Map<Character, Integer> points = new HashMap<>();
        points.put('2', 2);
        points.put('3', 3);
        points.put('4', 4);
        points.put('5', 5);
        points.put('6', 6);
        points.put('7', 7);
        points.put('8', 8);
        points.put('9', 9);
        points.put('J', 11);
        points.put('Q', 12);
        points.put('K', 13);
        points.put('A', 14);
        points.put('S', 4);
        points.put('H', 3);
        points.put('D', 2);
        points.put('C', 1);

        return points;
    }
}
