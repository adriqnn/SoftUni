package _04_JavaOOP._06_SOLID._01_SingleResponsibility;

import java.util.List;

// Class responsible for employee operations

public class EmployeeService {
    private EmployeeData employeeData;

    public EmployeeService(EmployeeData employeeData) {
        this.employeeData = employeeData;
    }

    public double calculateAverageSalary() {
        List<Employee> employees = this.employeeData.getAllEmployees();
        double totalSalary = 0.0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }

        return totalSalary / employees.size();
    }
}
