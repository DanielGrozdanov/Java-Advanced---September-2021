package JavaAdvanced.DefiningClasses.Lab.Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccountMap = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] commands = input.split("\\s+");
            String output = null;

            switch (commands[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccountMap.put(bankAccount.getId(), bankAccount);
                    output = "Account ID" + bankAccount.getId() + " created";
                    break;
                case "Deposit":
                    int id = Integer.parseInt(commands[1]);
                    int deposit = Integer.parseInt(commands[2]);
                    if (!bankAccountMap.containsKey(id)) {
                        output = "Account does not exist";
                    } else {
                        bankAccountMap.get(id).deposit(deposit);
                        output = "Deposited " + deposit + " to ID" + id;
                    }
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.parseDouble(commands[1]));
                    break;
                case "GetInterest":
                    int intId = Integer.parseInt(commands[1]);
                    int years = Integer.parseInt(commands[2]);
                    if (!bankAccountMap.containsKey(intId)) {
                        output = "Account does not exist";
                    } else {
                        double interest = bankAccountMap.get(intId).getInterest(years);
                        output = String.format("%.2f", interest);
                    }
                    break;
            }

            if (output != null) {
                System.out.println(output);
            }
            input = scanner.nextLine();
        }
    }
}
