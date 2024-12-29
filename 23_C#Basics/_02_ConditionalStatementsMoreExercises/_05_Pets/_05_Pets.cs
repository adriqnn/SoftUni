using System;

public class _05_Pets
{
    public static void Main(string[] args)
    {
        // Read input values
        int days = int.Parse(Console.ReadLine());
        int kilogramsOfFood = int.Parse(Console.ReadLine());
        double dogFoodInKilograms = Double.Parse(Console.ReadLine());
        double catFoodInKilograms = Double.Parse(Console.ReadLine());
        double turtleFoodInGrams = Double.Parse(Console.ReadLine());

        // Calculate food needed for each pet
        double dogFoodNeeded = dogFoodInKilograms * days;
        double catFoodNeeded = catFoodInKilograms * days;
        double turtleFoodNeeded = (turtleFoodInGrams * days) / 1000;

        // Calculate total food needed
        double foodNeeded = dogFoodNeeded + catFoodNeeded + turtleFoodNeeded;

        // Calculate remaining food
        double remainingFood = kilogramsOfFood - foodNeeded;

        // Print the result
        if (remainingFood >= 0)
        {
            Console.WriteLine($"{Math.Floor(remainingFood):F0} kilos of food left.");
        }
        else
        {
            Console.WriteLine($"{Math.Ceiling(Math.Abs(remainingFood)):F0} more kilos of food are needed.");
        }
    }
}
