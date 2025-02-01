using System;

public class _02_Passed
{
    public static void Main(string[] args)
    {
        // Read input value
        double grade = double.Parse(Console.ReadLine());

        // Print result
        if (grade >= 3.00)
        {
            Console.WriteLine("Passed!");
        }
    }
}
