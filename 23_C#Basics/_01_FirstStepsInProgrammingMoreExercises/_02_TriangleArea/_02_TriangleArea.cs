using System;

public class _02_TriangleArea
{
    public static void Main(string[] args)
    {
        // Read input data
        double triangleSide = double.Parse(Console.ReadLine());
        double triangleHeight = double.Parse(Console.ReadLine());

        // Calculate the area of the triangle
        double triangleArea = triangleSide * triangleHeight / 2;

        // Print the calculated area with two decimal places
        Console.WriteLine("{0:F2}\n", triangleArea);
    }
}