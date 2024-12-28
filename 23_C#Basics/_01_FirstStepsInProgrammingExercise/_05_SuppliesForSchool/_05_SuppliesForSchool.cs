using System;

public class _05_SuppliesForSchool
{
    public static void Main(string[] args)
    {
        // Read input data
        int numberOfPens = int.Parse(Console.ReadLine());
        int numberOfSharpies = int.Parse(Console.ReadLine());
        int litersOfCleaningSupplies = int.Parse(Console.ReadLine());
        int discountPercentage = int.Parse(Console.ReadLine());

        // Calculate prices for each type of supply
        double pensPrice = numberOfPens * 5.80;
        double sharpiesPrice = numberOfSharpies * 7.20;
        double cleaningSuppliesPrice = litersOfCleaningSupplies * 1.20;

        // Calculate total price with discount
        double totalPrice = (pensPrice + sharpiesPrice + cleaningSuppliesPrice) * (1 - discountPercentage * 0.01);

        // Print the total price
        Console.WriteLine("{0:F2}", totalPrice);
    }
}
