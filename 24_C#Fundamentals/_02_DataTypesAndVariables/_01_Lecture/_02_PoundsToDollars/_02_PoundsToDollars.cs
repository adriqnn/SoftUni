using System;

public class _02_PoundsToDollars
{
    public static void Main(string[] args)
    {
        // Read input value
        double inputPounds = double.Parse(Console.ReadLine());

        // Add variable
        double poundsToDollars = inputPounds * 1.31;

        // Print result
        Console.WriteLine($"{poundsToDollars:F3}", poundsToDollars);
    }
}
