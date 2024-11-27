using System;

public class _07_Shopping
{
    public static void Main(string[] args)
    {
        // Read the input values
        double budget = double.Parse(Console.ReadLine());
        double gpus = double.Parse(Console.ReadLine());
        double processors = double.Parse(Console.ReadLine());
        int memorySticks = int.Parse(Console.ReadLine());

        // Calculate the prices of each component
        double gpusPrice = gpus * 250;
        double processorsPrice = processors * (gpusPrice * 0.35);
        double memoryPrice = memorySticks * (gpusPrice * 0.1);

        // Calculate the total price
        double totalPrice = gpusPrice + processorsPrice + memoryPrice;

        // Apply discount if GPUs are more expensive than processors
        if (gpus > processors)
        {
            totalPrice *= 0.85;
        }

        // Compare the total price with the budget and print the result
        if (totalPrice <= budget)
        {
            Console.WriteLine($"You have {budget - totalPrice:F2} leva left!");
        }
        else
        {
            Console.WriteLine($"Not enough money! You need {totalPrice - budget:F2} leva more!");
        }
    }
}
