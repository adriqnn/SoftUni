using System;

public class _06_TruckDriver
{
    public static void Main(string[] args)
    {
        // Read input values
        string season = Console.ReadLine().ToLower();
        double kilometersPerMonth = double.Parse(Console.ReadLine());

        // Add variables
        double courseCost = 0;

        // Calculate the cost of the course based on the kilometers and season, and removing the tax
        if (kilometersPerMonth <= 5000)
        {
            if (season == "spring" || season == "autumn")
            {
                courseCost = kilometersPerMonth * 0.75 * 4 * 0.90;
            }
            else if (season == "summer")
            {
                courseCost = kilometersPerMonth * 0.90 * 4 * 0.90;
            }
            else
            {
                courseCost = kilometersPerMonth * 1.05 * 4 * 0.90;
            }
        }
        else if (kilometersPerMonth <= 10000)
        {
            if (season == "spring" || season == "autumn")
            {
                courseCost = kilometersPerMonth * 0.95 * 4 * 0.90;
            }
            else if (season == "summer")
            {
                courseCost = kilometersPerMonth * 1.10 * 4 * 0.90;
            }
            else
            {
                courseCost = kilometersPerMonth * 1.25 * 4 * 0.90;
            }
        }
        else
        {
            courseCost = kilometersPerMonth * 1.45 * 4 * 0.90;
        }

        // Print the result
        Console.WriteLine($"{courseCost:F2}");
    }
}
