using System;

public class _01_TrapezoidArea
{
    public static void Main(string[] args)
    {
        // Read input data
        double basisOne = double.Parse(Console.ReadLine());
        double basisTwo = double.Parse(Console.ReadLine());
        double height = double.Parse(Console.ReadLine());

        // Calculate the area of the trapezoid
        double trapezoidArea = (basisOne + basisTwo) * height / 2;

        // Print the calculated area with two decimal places
        Console.WriteLine("{0:F2}", trapezoidArea);
    }
}
