package JavaAdvanced.Generics.Exercise.CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        CustomList<String> customList = new CustomList<>();

        while (!command.equals("END")) {
            String[] parts = command.split(" ");
            switch (parts[0]) {
                case "Add":
                    customList.add(parts[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(parts[1]));
                    break;
                case "Max":
                    System.out.println(customList.max());
                    break;
                case "Min":
                    System.out.println(customList.min());
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterElement(parts[1]));
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(parts[1]),Integer.parseInt(parts[2]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(parts[1]));
                    break;
                case "Sort":
                    Sorter.sort(customList);
                    break;
                case "Print":
                    System.out.print(customList);
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
