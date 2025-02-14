using System;

public class _01_ConvertMetersToKilometers
{
    public static void Main(string[] args)
    {
        // Read input value
        double meters = double.Parse(Console.ReadLine());

        // Add variable
        double transformMetersToKilometers = meters / 1000;

        // Print result
        Console.WriteLine($"{transformMetersToKilometers:F2}");
    }
}
