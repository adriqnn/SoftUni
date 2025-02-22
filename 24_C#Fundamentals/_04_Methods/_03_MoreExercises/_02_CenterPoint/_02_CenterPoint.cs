using System;

public class _02_CenterPoint
{
    public static void Main(string[] args)
    {
        // Read input values
        double x1 = double.Parse(Console.ReadLine());
        double y1 = double.Parse(Console.ReadLine());
        double x2 = double.Parse(Console.ReadLine());
        double y2 = double.Parse(Console.ReadLine());

        // Create method that prints the closest point
        rectangleDistance(x1, y1, x2, y2);
    }

    private static void rectangleDistance(double x1, double y1, double x2, double y2)
    {
        double first = Math.Sqrt((x1 * x1) + (y1 * y1));
        double second = Math.Sqrt((x2 * x2) + (y2 * y2));

        if (first <= second)
        {
            Console.WriteLine($"({x1}, {y1})");
        }
        else
        {
            Console.WriteLine($"({x2}, {y2})");
        }
    }
}
