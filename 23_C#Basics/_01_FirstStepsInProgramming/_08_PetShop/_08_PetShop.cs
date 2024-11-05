using System;

public class _08_PetShop
{
    public static void Main(string[] args)
    {
        // Read input data
        int dogsCount = int.Parse(Console.ReadLine());
        int otherAnimalsCount = int.Parse(Console.ReadLine());

        // Calculate costs for dogs and other animals
        double costForAllDogs = dogsCount * 2.50;
        double costForAllTheOtherAnimals = otherAnimalsCount * 4.00;

        // Calculate total cost
        double totalCost = costForAllDogs + costForAllTheOtherAnimals;

        // Print the total cost
        Console.WriteLine(totalCost + " lv.");
    }
}
