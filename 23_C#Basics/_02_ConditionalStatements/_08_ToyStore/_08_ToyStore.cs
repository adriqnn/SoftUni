using System;

public class _08_ToyStore
{
    public static void Main(string[] args)
    {
        // Read the input
        double travelCost = double.Parse(Console.ReadLine());
        int puzzles = int.Parse(Console.ReadLine());
        int dolls = int.Parse(Console.ReadLine());
        int bears = int.Parse(Console.ReadLine());
        int minions = int.Parse(Console.ReadLine());
        int trucks = int.Parse(Console.ReadLine());

        // Calculate the revenue from selling each type of toy
        double puzzleRevenue = puzzles * 2.60;
        double dollRevenue = dolls * 3.00;
        double bearRevenue = bears * 4.10;
        double minionRevenue = minions * 8.20;
        double truckRevenue = trucks * 2.00;

        // Calculate the total revenue and number of sold toys
        double totalRevenue = puzzleRevenue + dollRevenue + bearRevenue + minionRevenue + truckRevenue;
        int totalToysSold = puzzles + dolls + bears + minions + trucks;

        // Apply discounts if the number of sold toys is 50 or more
        if (totalToysSold >= 50)
        {
            totalRevenue *= 0.75; // 25% discount
        }

        // Subtract rent and check if there's enough money for travel
        double profitAfterRent = totalRevenue * 0.9; // 10% for rent
        double moneyLeft = profitAfterRent - travelCost;

        // Print the result
        if (moneyLeft >= 0)
        {
            Console.WriteLine("Yes! {0:F2} lv left.", moneyLeft);
        }
        else
        {
            Console.WriteLine("Not enough money! {0:F2} lv needed.", Math.Abs(moneyLeft));
        }
    }
}
