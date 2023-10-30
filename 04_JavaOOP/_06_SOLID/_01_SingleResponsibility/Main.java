package _04_JavaOOP._06_SOLID._01_SingleResponsibility;

public class Main {
    public static void main(String[] args) {
        // Single Responsibility example

        EmployeeData employeeData = new EmployeeData();

        // Create employees and add them to the data store
        Employee john = new Employee("John", 50000.0);
        Employee alice = new Employee("Alice", 60000.0);

        employeeData.addEmployee(john);
        employeeData.addEmployee(alice);

        // Use the EmployeeService to perform operations on employees
        EmployeeService employeeService = new EmployeeService(employeeData);

        double averageSalary = employeeService.calculateAverageSalary();
        System.out.println("Average Salary: $" + averageSalary);
    }
}
