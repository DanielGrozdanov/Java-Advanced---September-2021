package JavaAdvanced.SetsAndMapsAdvanced.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("search")) {

            String[] split = input.split("-");
            if (!phoneBook.containsKey(split[0])) {
                phoneBook.put(split[0], split[1]);
            } else {
                phoneBook.put(phoneBook.get(split[0]), split[1]);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        StringBuilder builder = new StringBuilder();

        while (!input.equals("stop")){
            if (!phoneBook.containsKey(input)){
                builder.append("Contact ").append(input).append(" does not exist.");
                builder.append(System.lineSeparator());
            }else {
                builder.append(input).append(" -> ").append(phoneBook.get(input));
                builder.append(System.lineSeparator());

            }

            input = scanner.nextLine();
        }
        System.out.println(builder.toString().trim());
    }
}
