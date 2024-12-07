using System;

public class _03_NewHouse
{
    public static void Main(string[] args)
    {
        // Read input values
        string flowerType = Console.ReadLine();
        int quantity = int.Parse(Console.ReadLine());
        int budget = int.Parse(Console.ReadLine());

        double totalCost = 0;

        // Calculate the total cost based on flower type and quantity
        switch (flowerType)
        {
            case "Roses":
                if (quantity <= 80)
                {
                    totalCost = quantity * 5.00;
                }
                else
                {
                    totalCost = (quantity * 5.00) * 0.9;
                }
                break;
            case "Dahlias":
                if (quantity <= 90)
                {
                    totalCost = quantity * 3.80;
                }
                else
                {
                    totalCost = (quantity * 3.80) * 0.85;
                }
                break;
            case "Tulips":
                if (quantity <= 80)
                {
                    totalCost = quantity * 2.80;
                }
                else
                {
                    totalCost = (quantity * 2.80) * 0.85;
                }
                break;
            case "Narcissus":
                if (quantity < 120)
                {
                    totalCost = (quantity * 3.00) * 1.15;
                }
                else
                {
                    totalCost = quantity * 3.00;
                }
                break;
            default: // For "Gladiolus" or other types
                if (quantity < 80)
                {
                    totalCost = (quantity * 2.50) * 1.2;
                }
                else
                {
                    totalCost = quantity * 2.50;
                }
                break;
        }

        // Calculate the difference between budget and total cost
        double difference = Math.Abs(budget - totalCost);

        // Check if the flower type and quantity are valid
        bool isValidFlower = totalCost != 0;

        // Determine the appropriate output based on budget
        if (isValidFlower)
        {
            if (budget >= totalCost)
            {
                Console.WriteLine($"Hey, you have a great garden with {quantity} {flowerType} and {difference:F2} leva left.");
            }
            else
            {
                Console.WriteLine($"Not enough money, you need {difference:F2} leva more.");
            }
        }
    }
}
