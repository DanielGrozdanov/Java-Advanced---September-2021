package JavaAdvanced.DefiningClasses.Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Car> carArrayList = new ArrayList<>();

        while (n-- > 0) {
            String[] input = scanner.nextLine().split(" ");

            Car car;
            if (input.length == 1) {
                car = new Car(input[0]);
            } else {
                car = new Car(input[0], input[1], Integer.parseInt(input[2]));
            }
            carArrayList.add(car);
        }

        carArrayList.forEach(System.out::println);
    }
}
