using System;

public class _03_Flowers
{
    public static void Main(string[] args)
    {
        // Read input values
        int chrysanthemums = int.Parse(Console.ReadLine());
        int roses = int.Parse(Console.ReadLine());
        int tulips = int.Parse(Console.ReadLine());
        string season = Console.ReadLine().ToLower();
        string holiday = Console.ReadLine().ToLower();

        // Add helpful variables
        double flowerCost = 0;
        int allFlowersBought = chrysanthemums + roses + tulips;
        bool isHoliday = holiday == "y";

        // Calculate initial price based on season
        if (season == "spring" || season == "summer")
        {
            flowerCost = (chrysanthemums * 2.00) + (roses * 4.10) + (tulips * 2.50);
        }
        else
        {
            flowerCost = (chrysanthemums * 3.75) + (roses * 4.50) + (tulips * 4.15);
        }

        // Add price increase based on holiday
        if (isHoliday)
        {
            flowerCost *= 1.15;
        }

        // Add discount based on season and flower type count
        if (season == "spring" && tulips > 7)
        {
            flowerCost *= 0.95;
        }
        else if (season == "winter" && roses >= 10)
        {
            flowerCost *= 0.90;
        }

        // Add discount on overall flower count
        if (allFlowersBought >= 20)
        {
            flowerCost *= 0.8;
        }

        // Add arrangement price
        flowerCost += 2;

        // Print the result
        Console.WriteLine($"{flowerCost:F2}");
    }
}
