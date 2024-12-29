using System;

public class _07_AreaOfFigures
{
    public static void Main(string[] args)
    {
        // Read the shape input
        string shape = Console.ReadLine();

        // Read additional information based on the shape, calculate and print the area of the shape
        if (shape.Equals("square"))
        {
            double squareSide = double.Parse(Console.ReadLine());
            double squareArea = squareSide * squareSide;
            
            Console.WriteLine("{0:F3}", squareArea);
        }
        else if (shape.Equals("rectangle"))
        {
            double rectangleWidth = double.Parse(Console.ReadLine());
            double rectangleHeight = double.Parse(Console.ReadLine());
            double rectangleArea = rectangleWidth * rectangleHeight;
            
            Console.WriteLine("{0:F3}", rectangleArea);
        }
        else if (shape.Equals("circle"))
        {
            double circleRadius = double.Parse(Console.ReadLine());
            double circleArea = Math.PI * circleRadius * circleRadius;
            
            Console.WriteLine("{0:F3}", circleArea);
        }
        else if (shape.Equals("triangle"))
        {
            double triangleBase = double.Parse(Console.ReadLine());
            double triangleHeight = double.Parse(Console.ReadLine());
            double triangleArea = (triangleBase * triangleHeight) / 2;
            
            Console.WriteLine("{0:F3}", triangleArea);
        }
    }
}
