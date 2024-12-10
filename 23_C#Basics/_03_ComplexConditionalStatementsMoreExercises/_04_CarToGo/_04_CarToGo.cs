using System;

public class _04_CarToGo
{
    public static void Main(string[] args)
    {
        // Read input values
        double budget = double.Parse(Console.ReadLine());
        string season = Console.ReadLine().ToLower();

        // Add variables
        string carClass = "";
        double fee = 0;

        // Determine based on season the type of car
        string carType = season == "summer" ? "Cabrio" : "Jeep";

        // Determine class type based on budget and calculate fee
        if (budget <= 100)
        {
            carClass = "Economy class";
            fee = season == "summer" ? budget * 0.35 : budget * 0.65;
        }
        else if (budget <= 500)
        {
            carClass = "Compact class";
            fee = season == "summer" ? budget * 0.45 : budget * 0.80;
        }
        else
        {
            carClass = "Luxury class";
            carType = "Jeep";
            fee = budget * 0.90;
        }

        // Print the result
        Console.WriteLine($"{carClass}");
        Console.WriteLine($"{carType} - {fee:F2}");

    }
}
