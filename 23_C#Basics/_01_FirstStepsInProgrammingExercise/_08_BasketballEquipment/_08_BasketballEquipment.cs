using System;

public class _08_BasketballEquipment
{
    public static void Main(string[] args)
    {
        // Read input data
        int trainingPrice = int.Parse(Console.ReadLine());

        // Calculate prices for each equipment
        double shoes = trainingPrice * 0.6;
        double outfit = shoes * 0.8;
        double basketball = outfit * 0.25;
        double accessories = basketball * 0.2;

        // Calculate the total cost
        double totalSum = trainingPrice + shoes + outfit + basketball + accessories;

        // Print the total cost
        Console.WriteLine("{0:F2}\n", totalSum);
    }
}

