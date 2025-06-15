using System;
using System.Collections.Generic;
using System.Linq;

public class _05_Students
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        List<Student> students = new List<Student>();

        // Create collection of students
        for (int i = 0; i < n; i++)
        {
            string[] tokens = Console.ReadLine().Split(' ', StringSplitOptions.RemoveEmptyEntries);

            string firstName = tokens[0];
            string lastName = tokens[1];
            double grade = double.Parse(tokens[2]);

            Student student = new Student(firstName, lastName, grade);
            students.Add(student);
        }

        // Print result
        Console.WriteLine(string.Join(Environment.NewLine, students.OrderByDescending(e => e.Grade).Select(e => e.ToString())));
    }
}

// Create practice Student class
class Student
{
    public string FirstName { get; set; }
    public string LastName { get; set; }
    public double Grade { get; set; }

    public Student(string firstName, string lastName, double grade)
    {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Grade = grade;
    }

    public override string ToString()
    {
        return $"{this.FirstName} {this.LastName}: {this.Grade:F2}";
    }
}
