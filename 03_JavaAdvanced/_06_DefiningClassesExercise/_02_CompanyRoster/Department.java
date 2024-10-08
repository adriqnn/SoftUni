package _03_JavaAdvanced._06_DefiningClassesExercise._02_CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> employees;
    private String name;

    public Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public double calculateAverageSalary(){
        return  this.employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

    public String getName() {
        return this.name;
    }
}
