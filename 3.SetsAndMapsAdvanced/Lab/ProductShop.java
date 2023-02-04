package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Double>> productShop = new TreeMap<>();

        while (!input.equals("Revision")) {
            String[] parameters = input.split(", ");

            String shop = parameters[0];
            String product = parameters[1];
            double price = Double.parseDouble(parameters[2]);
            productShop.putIfAbsent(shop, new LinkedHashMap<>());
            productShop.get(shop).put(product,price);

            input = scanner.nextLine();
        }

        productShop.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + "->");
            e.getValue().entrySet().stream().forEach(inner -> System.out.printf("Product: %s, Price: %.1f%n", inner.getKey(), inner.getValue()));
        });
    }
}
