using System;

public class _04_VegetableMarket
{
    public static void Main(string[] args)
    {
        // Read input prices and kilograms
        double priceForKilogramVegetables = double.Parse(Console.ReadLine());
        double priceForKilogramFruits = double.Parse(Console.ReadLine());
        int kilogramsVegetables = int.Parse(Console.ReadLine());
        int kilogramsFruits = int.Parse(Console.ReadLine());

        // Calculate total revenue
        double revenueInEuro = ((priceForKilogramVegetables * kilogramsVegetables) + (priceForKilogramFruits * kilogramsFruits)) / 1.94;

        // Print the total revenue
        Console.WriteLine("{0:F2}", revenueInEuro);
    }
}
