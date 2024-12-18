using System;

public class _05_AverageNumber
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        double sum = 0;

        for (int i = 0; i < n; i++)
        {
            double number = double.Parse(Console.ReadLine());
            sum += number;
        }

        // Print the average
        Console.WriteLine($"{sum / n:F2}");
    }
}
