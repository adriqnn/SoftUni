using System;

public class _01_MatchTickets
{
    public static void Main(string[] args)
    {
        // Read input values
        double budget = double.Parse(Console.ReadLine());
        string category = Console.ReadLine().ToLower();
        int people = int.Parse(Console.ReadLine());

        // Set variable for cost values
        double transportCost = 0;
        double ticketsCost = 0;

        // Determine transport cost
        if (people <= 4)
        {
            transportCost = budget * 0.75;
        }
        else if (people <= 9)
        {
            transportCost = budget * 0.60;
        }
        else if (people <= 24)
        {
            transportCost = budget * 0.50;
        }
        else if (people <= 49)
        {
            transportCost = budget * 0.40;
        }
        else
        {
            transportCost = budget * 0.25;
        }

        // Determine ticket cost
        if (category == "vip")
        {
            ticketsCost = people * 499.99;
        }
        else
        {
            ticketsCost = people * 249.99;
        }

        // Calculate total outcome for budget
        double calculateBudget = budget - (transportCost + ticketsCost);

        // Print result based on budget value
        if (calculateBudget < 0)
        {
            Console.WriteLine($"Not enough money! You need {Math.Abs(calculateBudget):F2} leva.");
        }
        else
        {
            Console.WriteLine($"Yes! You have {calculateBudget:F2} leva left.");
        }
    }
}
