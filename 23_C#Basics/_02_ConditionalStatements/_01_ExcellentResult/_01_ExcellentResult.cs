using System;

public class _01_ExcellentResult
{
    public static void Main(string[] args)
    {
        // Read the grade input
        double grade = double.Parse(Console.ReadLine());

        // Determine if the grade is excellent
        bool isExcellent = grade >= 5.5;

        // Print "Excellent!" if the grade is excellent
        if (isExcellent)
        {
            Console.WriteLine("Excellent!");
        }
    }
}
