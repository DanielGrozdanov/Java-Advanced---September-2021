package JavaAdvanced.SetsAndMapsAdvanced.Exercises;

import com.sun.jdi.Value;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> users = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String email = scanner.nextLine();
            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")) {
                users.putIfAbsent(input, email);
            }

            input = scanner.nextLine();
        }

        users.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        });
    }
}