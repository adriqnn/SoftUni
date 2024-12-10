using System;

public class _05_Vacation
{
    public static void Main(string[] args)
    {
        // Read input values
        double budget = double.Parse(Console.ReadLine());
        string season = Console.ReadLine().ToLower();

        // Add variables
        string accommodation = "";
        string location = season == "summer" ? "Alaska" : "Morocco";
        double price = 0;

        // Determine accommodation and price based on budget
        if (budget <= 1000)
        {
            accommodation = "Camp";
            price = season == "summer" ? budget * 0.65 : budget * 0.45;
        }
        else if (budget <= 3000)
        {
            accommodation = "Hut";
            price = season == "summer" ? budget * 0.80 : budget * 0.60;
        }
        else
        {
            accommodation = "Hotel";
            price = budget * 0.90;
        }

        // Print the result
        Console.WriteLine($"{location} - {accommodation} - {price:F2}");
    }
}

