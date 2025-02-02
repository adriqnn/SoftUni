using System;

public class _01_StudentInformation
{
    public static void Main(string[] args)
    {
        // Read input values
        string name = Console.ReadLine();
        int age = int.Parse(Console.ReadLine());
        double grade = double.Parse(Console.ReadLine());

        // Print result 
        System.Console.WriteLine(StudentPrint(name, age, grade));
    }

    // Add method for the printing
    private static string StudentPrint(string name, int age, double grade)
    {
        return $"Name: {name}, Age: {age}, Grade: {grade:F2}";
    }
}
