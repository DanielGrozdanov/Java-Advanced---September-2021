package JavaAdvanced.DefiningClasses.Exercise.RawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> stringCarMap = new LinkedHashMap<>();

        getUserInput(scanner, n, stringCarMap);

        ArrayList<String> result = new ArrayList<>();
        String command = scanner.nextLine();

        checkCarMapOutput(stringCarMap, result, command);

        printResult(result);

    }

    private static void printResult(ArrayList<String> result) {
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static void getUserInput(Scanner scanner, int n, Map<String, Car> stringCarMap) {
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];

            ArrayList<Tyre> tyres = new ArrayList<>();
            Tyre tyre = new Tyre(Double.parseDouble(input[5]), Integer.parseInt(input[6]),
                    Double.parseDouble(input[7]), Integer.parseInt(input[8]),
                    Double.parseDouble(input[9]), Integer.parseInt(input[10]),
                    Double.parseDouble(input[11]), Integer.parseInt(input[12]));
            tyres.add(tyre);

            Car car = new Car(model, engineSpeed, enginePower, cargoWeight, cargoType, tyres);
            stringCarMap.putIfAbsent(model, car);
        }
    }

    private static void checkCarMapOutput(Map<String, Car> stringCarMap, ArrayList<String> result, String command) {
        if (command.equals("fragile")) {
            stringCarMap.values().forEach(car -> {
                if (car.getCargoType().equals("fragile")) {
                    for (Tyre tyre : car.getTyres()) {
                        if (tyre.getTire1Pressure() < 1 || tyre.getTire2Pressure() < 1 || tyre.getTire3Pressure() < 1 || tyre.getTire4Pressure() < 1) {
                            result.add(car.getModel());
                            break;
                        }
                    }
                }
            });
        } else {
            stringCarMap.values().forEach(car -> {
                if (car.getCargoType().equals("flamable") && car.getEnginePower() > 250) {
                    result.add(car.getModel());
                }
            });
        }
    }
}
