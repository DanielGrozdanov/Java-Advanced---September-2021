package JavaAdvanced.SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            String[] tokens = input.split(", ");
            String command = tokens[0];
            String registration = tokens[1];

            if (command.equals("IN")) {
                parkingLot.add(registration);
            } else {
                parkingLot.remove(registration);
            }

            input = scanner.nextLine();
        }

        String output = parkingLot.isEmpty() ? "Parking Lot is Empty" : parkingLot.stream()
                .collect(Collectors.joining(System.lineSeparator()));
        System.out.println(output);

    }
}
