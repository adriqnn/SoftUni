using System;

public class _04_FishingBoat
{
    public static void Main(string[] args)
    {
        // Read input values
        int budget = int.Parse(Console.ReadLine());
        string season = Console.ReadLine();
        int numberOfPeople = int.Parse(Console.ReadLine());

        double basePrice = 0;
        bool isAutumn = season.Equals("Autumn");

        // Calculate the base price based on the season
        // Apply discounts based on the number of people
        switch (season)
        {
            case "Spring":
                basePrice = 3000;
                if (numberOfPeople <= 6)
                {
                    basePrice *= 0.90;
                }
                else if (numberOfPeople <= 11)
                {
                    basePrice *= 0.85;
                }
                else
                {
                    basePrice *= 0.75;
                }
                break;
            case "Summer":
            case "Autumn":
                basePrice = 4200;
                if (numberOfPeople <= 6)
                {
                    basePrice *= 0.90;
                }
                else if (numberOfPeople <= 11)
                {
                    basePrice *= 0.85;
                }
                else
                {
                    basePrice *= 0.75;
                }
                break;
            case "Winter":
                basePrice = 2600;
                if (numberOfPeople <= 6)
                {
                    basePrice *= 0.90;
                }
                else if (numberOfPeople <= 11)
                {
                    basePrice *= 0.85;
                }
                else
                {
                    basePrice *= 0.75;
                }
                break;
        }

        // Apply additional adjustments based on season and odd/even number of people
        if (isAutumn)
        {
            basePrice *= 1.00;
        }
        else
        {
            if (numberOfPeople % 2 == 0)
            {
                basePrice *= 0.95;
            }
            else
            {
                basePrice *= 1.00;
            }
        }

        double difference = budget - basePrice;

        // Determine the appropriate output based on budget
        if (budget >= basePrice)
        {
            Console.WriteLine($"Yes! You have {Math.Abs(difference):F2} leva left.");
        }
        else
        {
            Console.WriteLine($"Not enough money! You need {Math.Abs(difference):F2} leva.");
        }
    }
}
