using System;

public class _03_RectangleArea
{
    public static void Main(string[] args)
    {
        // Read input values
        string inputA = Console.ReadLine();
        string inputB = Console.ReadLine();

        // Parse the inputs to integers
        int sideA = int.Parse(inputA);
        int sideB = int.Parse(inputB);

        // Calculate the area
        int areaOfRectangle = sideA * sideB;

        // Print the area
        Console.WriteLine(areaOfRectangle);
    }
}