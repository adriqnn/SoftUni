using System;

public class _05_Journey
{
    public static void Main(string[] args)
    {
        // Read input values
        double budget = double.Parse(Console.ReadLine());
        string season = Console.ReadLine();

        double price = 0;
        string destination = "";
        string accommodation = "";

        // Determine the destination and accommodation based on budget and season
        if (budget <= 100)
        {
            destination = "Bulgaria";
            if (season.Equals("summer"))
            {
                accommodation = "Camp";
                price = budget * 0.30;
            }
            else if (season.Equals("winter"))
            {
                accommodation = "Hotel";
                price = budget * 0.70;
            }
        }
        else if (budget <= 1000)
        {
            destination = "Balkans";
            if (season.Equals("summer"))
            {
                accommodation = "Camp";
                price = budget * 0.40;
            }
            else if (season.Equals("winter"))
            {
                accommodation = "Hotel";
                price = budget * 0.80;
            }
        }
        else
        {
            destination = "Europe";
            accommodation = "Hotel";
            price = budget * 0.90;
        }

        double difference = budget - price;

        // Determine the appropriate output based on budget
        if (budget >= price)
        {
            Console.WriteLine($"Somewhere in {destination}");
            Console.WriteLine($"{accommodation} - {price:F2}");
        }
    }
}
