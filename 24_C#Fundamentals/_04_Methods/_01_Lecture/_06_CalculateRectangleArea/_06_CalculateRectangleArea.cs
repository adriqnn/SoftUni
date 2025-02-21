using System;

public class _06_CalculateRectangleArea
{
    public static void Main(string[] args)
    {
        // Read input values
        double width = double.Parse(Console.ReadLine());
        double height = double.Parse(Console.ReadLine());

        // Create method that calculates rectangle area
        rectangleArea(width, height);
    }

    private static void rectangleArea(double width, double height)
    {
        Console.WriteLine($"{width * height:F0}");
    }
}
