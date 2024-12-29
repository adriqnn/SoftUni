using System;

public class _08_FuelTank2
{
    public static void Main(string[] args)
    {
        // Read input: fuel type, fuel amount, and club card status
        string fuelType = Console.ReadLine();
        double fuelAmount = double.Parse(Console.ReadLine());
        string clubCard = Console.ReadLine().ToLower();

        // Initialize variable to store the price of the fuel
        double priceOfTheFuel = 0;

        // Calculate fuel price based on club card status and fuel type
        if (clubCard.Equals("yes", StringComparison.OrdinalIgnoreCase))
        {
            if (fuelType.Equals("Gasoline", StringComparison.OrdinalIgnoreCase))
            {
                priceOfTheFuel = fuelAmount * 2.04;
            }
            else if (fuelType.Equals("Diesel", StringComparison.OrdinalIgnoreCase))
            {
                priceOfTheFuel = fuelAmount * 2.21;
            }
            else if (fuelType.Equals("Gas", StringComparison.OrdinalIgnoreCase))
            {
                priceOfTheFuel = fuelAmount * 0.85;
            }
        }
        else
        {
            if (fuelType.Equals("Gasoline", StringComparison.OrdinalIgnoreCase))
            {
                priceOfTheFuel = fuelAmount * 2.22;
            }
            else if (fuelType.Equals("Diesel", StringComparison.OrdinalIgnoreCase))
            {
                priceOfTheFuel = fuelAmount * 2.33;
            }
            else if (fuelType.Equals("Gas", StringComparison.OrdinalIgnoreCase))
            {
                priceOfTheFuel = fuelAmount * 0.93;
            }
        }

        // Apply discounts based on fuel amount
        if (fuelAmount >= 20 && fuelAmount <= 25)
        {
            priceOfTheFuel *= 0.92;
        }
        else if (fuelAmount > 25)
        {
            priceOfTheFuel *= 0.90;
        }

        // Print the final price of the fuel
        Console.WriteLine($"{priceOfTheFuel:F2} lv.");
    }
}
