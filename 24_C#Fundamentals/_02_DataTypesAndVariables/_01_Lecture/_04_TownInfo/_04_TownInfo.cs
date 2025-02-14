using System;

public class _04_TownInfo
{
    public static void Main(string[] args)
    {
        // Read input values
        string town = Console.ReadLine(), population = Console.ReadLine(), area = Console.ReadLine();

        // Print result
        Console.WriteLine($"Town {town} has population of {population} and area {area} square km.");
    }
}
