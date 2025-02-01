using System;

public class _03_PassedOrFailed
{
    public static void Main(string[] args)
    {
        // Read input value
        double grade = double.Parse(Console.ReadLine());

        // Print result
        if (grade >= 3)
        {
            Console.WriteLine("Passed!");
        }
        else
        {
            Console.WriteLine("Failed!");
        }
    }
}
