using System;

public class _09_Orders
{
    public static void Main(string[] args)
    {
        // Read input value
        int numberOfOrders = int.Parse(Console.ReadLine());

        // Add variable
        double totalPrice = 0;

        // Calculate the price for all the orders
        for (int i = 0; i < numberOfOrders; i++)
        {
            // Orders
            double pricePerCapsule = double.Parse(Console.ReadLine());
            int daysInMonth = int.Parse(Console.ReadLine());
            int capsulesCount = int.Parse(Console.ReadLine());

            double priceFormula = ((daysInMonth * capsulesCount) * pricePerCapsule);
            Console.WriteLine($"The price for the coffee is: ${priceFormula:F2}");
            totalPrice += priceFormula;
        }

        // Print result
        Console.WriteLine($"Total: ${totalPrice:F2}");
    }
}
