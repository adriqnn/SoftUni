using System;

public class _01_CompanyRoster
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variables
        List<Employee> employeeList = new List<Employee>();
        List<Department> departments = new List<Department>();

        // Create database for the employees
        for (int i = 0; i < n; i++)
        {
            string[] consoleLine = Console.ReadLine().Split(" ", StringSplitOptions.RemoveEmptyEntries);

            string name = consoleLine[0];
            double salary = double.Parse(consoleLine[1]);
            string department = consoleLine[2];

            bool containsDepartment = false;
            int index = 0;

            for (int j = 0; j < departments.Count; j++)
            {
                if (departments[j].Name.Equals(department))
                {
                    containsDepartment = true;
                    index = j;
                }
            }

            if (containsDepartment)
            {
                departments[index].Number = departments[index].Number + 1;
                departments[index].Salaries = departments[index].Salaries + salary;
            }
            else
            {
                Department newDepartment = new Department(department, 1, salary);
                departments.Add(newDepartment);
            }

            Employee employee = new Employee(name, salary, department);
            employeeList.Add(employee);
        }

        // Calculate average
        foreach (Department department in departments)
        {
            double average = department.Salaries / department.Number;
            department.Salaries = average;
        }

        // Sort
        departments = departments.OrderByDescending(d => d.Salaries).ToList();

        // Print result
        Console.WriteLine($"Highest Average Salary: {departments[0].Name}");
        employeeList = employeeList.OrderByDescending(e => e.Salary).ToList();
        foreach (Employee employee in employeeList)
        {
            if (employee.Department == departments[0].Name)
            {
                {
                    Console.WriteLine(employee);
                }
            }
        }
    }
}

// Create practice Employee class
class Employee
{
    public string Name { get; }
    public double Salary { get; }
    public string Department { get; }

    public Employee(string name, double salary, string department)
    {
        this.Name = name;
        this.Salary = salary;
        this.Department = department;
    }

    public override string ToString()
    {
        return $"{this.Name} {this.Salary:F2}";
    }
}

// Create practice Department class
class Department
{
    public string Name { get; set; }
    public int Number { get; set; } = 0;
    public double Salaries { get; set; } = 0;

    public Department(string department, int number, double salaries)
    {
        this.Name = department;
        this.Number = number;
        this.Salaries = salaries;
    }

    public override string ToString()
    {
        return $"{this.Name} {this.Number} {this.Salaries:F2}";
    }
}
