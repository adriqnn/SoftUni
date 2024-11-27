using System;

public class _04_ToyShop
{
    public static void Main(string[] args)
    {
        // Read the input values
        double travelCost = double.Parse(Console.ReadLine());
        double puzzles = double.Parse(Console.ReadLine());
        double dolls = double.Parse(Console.ReadLine());
        double bears = double.Parse(Console.ReadLine());
        double minions = double.Parse(Console.ReadLine());
        double trucks = double.Parse(Console.ReadLine());

        // Calculate the revenue from selling each type of toy
        double puzzlesPrice = puzzles * 2.60;
        double dollsPrice = dolls * 3.00;
        double bearsPrice = bears * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2.00;

        // Calculate the total revenue and number of sold toys
        double allToys = puzzles + dolls + bears + minions + trucks;
        double totalSum = puzzlesPrice + dollsPrice + bearsPrice + minionsPrice + trucksPrice;

        // Apply discount if the number of sold toys is 50 or more
        if (allToys >= 50)
        {
            totalSum *= 0.75; // 25% discount
        }

        // Subtract rent and check if there's enough money for travel
        double sumAfterRent = totalSum * 0.9; // 10% for rent
        double moneyLeft = sumAfterRent - travelCost;

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
