package JavaAdvanced.DefiningClasses.Exercise.CarSalesman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfEngines = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engineMap = new HashMap<>();

        Engine engine = null;
        for (int i = 0; i < numberOfEngines; i++) {
            String[] input = scanner.nextLine().split(" ");
            String model = input[0];
            int power = Integer.parseInt(input[1]);
            if (input.length == 2) {
                engine = new Engine(model, power);
            } else if (input.length == 4) {
                int displacement = Integer.parseInt(input[2]);
                String efficiency = input[3];
                engine = new Engine(model, power, displacement, efficiency);
            } else if (input.length == 3) {
                try {
                    int displacement = Integer.parseInt(input[2]);
                    engine = new Engine(model, power, displacement);
                } catch (NumberFormatException e) {
                    String efficiency = input[2];
                    engine = new Engine(model, power, efficiency);
                }
            }
            engineMap.put(model, engine);
        }

        ArrayList<Car> arrayList = new ArrayList<>();


        Car car = null;
        int numberOfCars = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfCars; i++) {
            String[] input = scanner.nextLine().split(" ");
            String model = input[0];
            String engineModel = input[1];
            Engine carEngine = engineMap.get(engineModel);
            if (input.length == 2) {
                car = new Car(model, carEngine);
            } else if (input.length == 4) {
                int weight = Integer.parseInt(input[2]);
                String color = input[3];
                car = new Car(model, carEngine, weight, color);
            } else if (input.length == 3) {
                try {
                    int weight = Integer.parseInt(input[2]);
                    car = new Car(model, carEngine, weight);
                } catch (NumberFormatException e) {
                    String color = input[2];
                    car = new Car(model, carEngine, color);
                }
            }
            arrayList.add(car);
        }

        arrayList.forEach(System.out::println);
    }
}
