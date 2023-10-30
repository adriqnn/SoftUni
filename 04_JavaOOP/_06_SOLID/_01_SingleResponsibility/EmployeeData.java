package _04_JavaOOP._06_SOLID._01_SingleResponsibility;

import java.util.ArrayList;
import java.util.List;

// Class responsible for employee data and storage
public class EmployeeData {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    public List<Employee> getAllEmployees() {
        return this.employees;
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
