package JavaAdvanced.DefiningClasses.Exercise.SpeedRacing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> carMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String model = input[0];
            double fuel = Double.parseDouble(input[1]);
            double consumption = Double.parseDouble(input[2]);
            Car car = new Car(model, fuel, consumption);
            carMap.putIfAbsent(model, car);
        }

        String commands = scanner.nextLine();
        while (!commands.equals("End")) {
            String[] input = commands.split(" ");
            Car car = carMap.get(input[1]);
            boolean drive = car.drive(Double.parseDouble(input[2]));
            if (!drive) {
                System.out.println("Insufficient fuel for the drive");
            }
            commands = scanner.nextLine();
        }

        carMap.values().forEach(System.out::println);
    }
}
