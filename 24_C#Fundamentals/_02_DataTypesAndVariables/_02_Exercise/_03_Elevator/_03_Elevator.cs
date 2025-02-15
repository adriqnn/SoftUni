using System;

public class _03_Elevator
{
    public static void Main(string[] args)
    {
        // Read input values
        int numberOfPeople = int.Parse(Console.ReadLine());
        int elevatorCapacity = int.Parse(Console.ReadLine());

        // Print result
        Console.WriteLine($"{Math.Ceiling(numberOfPeople * 1.00 / elevatorCapacity):F0}");
    }
}
