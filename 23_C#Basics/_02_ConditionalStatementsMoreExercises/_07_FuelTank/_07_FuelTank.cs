using System;

public class _07_FuelTank
{
    public static void Main(string[] args)
    {
        // Read input: fuel type and fuel amount
        string fuelType = Console.ReadLine();
        double fuelAmount = double.Parse(Console.ReadLine());

        // Check if the fuel type is valid
        bool validType = fuelType.Equals("Diesel") || fuelType.Equals("Gasoline") || fuelType.Equals("Gas");

        // Initialize a message based on fuel amount
        string fuelTank = fuelAmount < 25? $"Fill your tank with {fuelType.ToLower()}!" : $"You have enough {fuelType.ToLower()}.";

        // Check if the fuel type is valid and output the appropriate message
        if (validType)
        {
            Console.WriteLine(fuelTank);
        }
        else
        {
            Console.WriteLine("Invalid fuel!");
        }
    }
}
