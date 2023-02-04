package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.*;

public class CitiesByContinentsAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, ArrayList<String>>> citiesMap = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            citiesMap.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, ArrayList<String>> citiesWithCountry = citiesMap.get(continent);
            citiesWithCountry.putIfAbsent(country, new ArrayList<>());
            ArrayList<String> cities = citiesWithCountry.get(country);
            cities.add(city);

        }

        citiesMap.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + ":");

            entry.getValue().entrySet().stream().forEach(innerEntry -> {
                System.out.println(" " + innerEntry.getKey() + " -> " + String.join(", ", innerEntry.getValue()));
            });
        });
    }
}
