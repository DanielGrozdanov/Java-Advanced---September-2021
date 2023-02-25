package JavaAdvanced.DefiningClasses.Exercise.CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employeeList;

    public Department(String name) {
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Department setName(String name) {
        this.name = name;
        return this;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Department setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
        return this;
    }

    public double averageSalary() {
        return this.employeeList.stream().mapToDouble(Employee::getSalary).average().orElse(0);
    }
}
