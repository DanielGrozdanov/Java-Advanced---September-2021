package JavaAdvanced.SetsAndMapsAdvanced.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        Map<String,Integer> mineMap = new LinkedHashMap<>();


        while (!input.equals("stop")){
            if (!mineMap.containsKey(input)){
                mineMap.put(input,number);
            }else {
               mineMap.put(input, mineMap.get(input) + number);

            }
            input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }else {
                number = Integer.parseInt(scanner.nextLine());
            }
        }

        mineMap.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        });
    }
}
