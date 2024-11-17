using System;

public class _09_FishTank
{
    public static void Main(string[] args)
    {
        // Read input data
        int length = int.Parse(Console.ReadLine());
        int width = int.Parse(Console.ReadLine());
        int height = int.Parse(Console.ReadLine());
        double percentage = double.Parse(Console.ReadLine());

        // Calculate the volume of the tank in liters
        double volumeInLiters = length * width * height / 1000.0;

        // Calculate the multiplier for water displacement
        double multiplier = (100 - percentage) / 100;

        // Calculate the actual liters of water in the tank
        double litersOfWater = volumeInLiters * multiplier;

        // Print the liters of water
        Console.WriteLine(litersOfWater);
    }
}﻿
