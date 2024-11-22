using System;

public class _06_FishLand
{
    public static void Main(string[] args)
    {
        // Read input prices and kilos
        double priceOfMackerelPerKilo = double.Parse(Console.ReadLine());
        double priceOfSpratPerKilo = double.Parse(Console.ReadLine());
        double bonitoKilos = double.Parse(Console.ReadLine());
        double scadKilos = double.Parse(Console.ReadLine());
        double musselsKilos = double.Parse(Console.ReadLine());

        // Calculate prices for each type of fish
        double priceOfBonito = bonitoKilos * (priceOfMackerelPerKilo * 1.6);
        double priceOfScad = scadKilos * (priceOfSpratPerKilo * 1.8);
        double priceOfMussels = musselsKilos * 7.5;

        // Calculate the total sum
        double totalSum = priceOfBonito + priceOfScad + priceOfMussels;

        // Print the total sum with two decimal places
        Console.WriteLine("{0:F2}\n", totalSum);
    }
}
