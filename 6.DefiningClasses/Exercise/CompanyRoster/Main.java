package JavaAdvanced.DefiningClasses.Exercise.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departmentListMap = new HashMap<>();


        Employee employee;


        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String depName = input[3];

            if (input.length == 4) {
                employee = new Employee(name, salary, position, depName);
            } else if (input.length == 6) {
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                employee = new Employee(name, salary, position, depName, email, age);
            } else {
                try {
                    int age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary, position, depName, age);
                } catch (NumberFormatException e) {
                    String email = input[4];
                    employee = new Employee(name, salary, position, depName, email);
                }
            }

            departmentListMap.putIfAbsent(depName, new Department(depName));
            departmentListMap.get(depName).getEmployeeList().add(employee);
        }

        Department highestPaid = departmentListMap
                .entrySet()
                .stream()
                .max(Comparator.comparing(entry -> entry.getValue().averageSalary()))
                .get().getValue();


        System.out.println("Highest Average Salary: " + highestPaid.getName());
        highestPaid.getEmployeeList().stream().sorted((e1,e2) -> Double.compare(e2.getSalary(),e1.getSalary())).forEach(System.out::println);
    }
}
