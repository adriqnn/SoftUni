using System;

public class _05_TrainingLab
{
    public static void Main(string[] args)
    {
        // Read input dimensions
        double lengthOfTheRoom = double.Parse(Console.ReadLine());
        double widthOfTheRoom = double.Parse(Console.ReadLine());

        // Calculate the number of desks per row and number of rows
        long numberOfDesksPerRow = (long)Math.Round(lengthOfTheRoom * 100) / 120;
        long numberOfRows = (long)Math.Round((widthOfTheRoom * 100) - 100) / 70;

        // Calculate the total number of seats
        long numberOfSeats = (numberOfDesksPerRow * numberOfRows) - 3;

        // Print the total number of seats
        Console.WriteLine("{0:F2}", numberOfSeats);
    }
}
