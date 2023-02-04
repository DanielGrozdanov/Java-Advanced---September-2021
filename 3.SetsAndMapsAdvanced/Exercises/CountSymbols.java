package JavaAdvanced.SetsAndMapsAdvanced.Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> symbolsMap = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
             char symbol = input.charAt(i);
             if (!symbolsMap.containsKey(symbol)){
                 symbolsMap.put(symbol,1);
             }else {
                 symbolsMap.put(symbol, symbolsMap.get(symbol) + 1);
             }

        }

        symbolsMap.forEach((key,value) -> {
            System.out.println(key + ": " + value + " time/s");
        });
    }
}
