using System;

public class _08_CircleAreaAndPerimeter
{
    public static void Main(string[] args)
    {
        // Read the radius input
        double r = double.Parse(Console.ReadLine());

        // Calculate circle area and perimeter
        double circleArea = Math.PI * r * r;
        double circlePerimeter = 2 * Math.PI * r;

        // Print the calculated area and perimeter
        Console.WriteLine("{0:F2}", circleArea);
        Console.WriteLine("{0:F2}\n", circlePerimeter);
    }
}
