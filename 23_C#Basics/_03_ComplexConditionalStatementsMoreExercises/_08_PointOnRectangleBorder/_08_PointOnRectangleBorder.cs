using System;

public class _08_PointOnRectangleBorder
{
    public static void Main(string[] args)
    {
        // Read input for rectangle point one
        double sqrX1 = double.Parse(Console.ReadLine());
        double sqrY1 = double.Parse(Console.ReadLine());

        // Read input for rectangle point two
        double sqrX2 = double.Parse(Console.ReadLine());
        double sqrY2 = double.Parse(Console.ReadLine());

        // Read input for the point
        double x = double.Parse(Console.ReadLine());
        double y = double.Parse(Console.ReadLine());

        // Determine if the point is on the border of the rectangle and print the result
        if (y == sqrY1 && sqrX1 <= x && x <= sqrX2)
        {
            Console.WriteLine("Border");
        }
        else if (y == sqrY2 && sqrX1 <= x && x <= sqrX2)
        {
            Console.WriteLine("Border");
        }
        else if (x == sqrX1 && sqrY1 <= y && y <= sqrY2)
        {
            Console.WriteLine("Border");
        }
        else if (x == sqrX2 && sqrY1 <= y && y <= sqrY2)
        {
            Console.WriteLine("Border");
        }
        else
        {
            Console.WriteLine("Inside / Outside");
        }
    }
}
