using System;

public class _03_LongerLine
{
    public static void Main(string[] args)
    {
        // Read input values
        double x1 = double.Parse(Console.ReadLine());
        double y1 = double.Parse(Console.ReadLine());
        double x2 = double.Parse(Console.ReadLine());
        double y2 = double.Parse(Console.ReadLine());

        double a1 = double.Parse(Console.ReadLine());
        double b1 = double.Parse(Console.ReadLine());
        double a2 = double.Parse(Console.ReadLine());
        double b2 = double.Parse(Console.ReadLine());

        // Create method that determines the longer line
        printLongerLine(x1, y1, x2, y2, a1, b1, a2, b2);
    }

    private static void printLongerLine(double x1, double y1, double x2, double y2, double a1, double b1, double a2, double b2)
    {
        double distance1 = Math.Sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        double distance2 = Math.Sqrt(((a2 - a1) * (a2 - a1)) + ((b2 - b1) * (b2 - b1)));

        if (distance1 >= distance2)
        {
            rectangleDistance(x1, y1, x2, y2);
        }
        else
        {
            rectangleDistance(a1, b1, a2, b2);
        }
    }

    private static void rectangleDistance(double x1, double y1, double x2, double y2)
    {
        double first = Math.Sqrt((x1 * x1) + (y1 * y1));
        double second = Math.Sqrt((x2 * x2) + (y2 * y2));

        if (first <= second)
        {
            Console.Write($"({x1}, {y1})", x1, y1);
            Console.Write($"({x2}, {y2})", x2, y2);
        }
        else
        {
            Console.Write($"({x2}, {y2})", x2, y2);
            Console.Write($"({x1}, {y1})", x1, y1);
        }
    }
}
