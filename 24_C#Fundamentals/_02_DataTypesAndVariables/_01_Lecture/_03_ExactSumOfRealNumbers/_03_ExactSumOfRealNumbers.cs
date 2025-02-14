using System;
using System.Numerics;

public class _03_ExactSumOfRealNumbers
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        decimal sumOfRealNumbers = 0m;

        // Sum the numbers
        for (int i = 0; i < n; i++)
        {
            decimal realNumber = decimal.Parse(Console.ReadLine());
            sumOfRealNumbers += realNumber;
        }

        // Print result
        Console.WriteLine($"{sumOfRealNumbers}");
    }
}
