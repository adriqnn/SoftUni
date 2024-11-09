using System;

public class _02_RadiansToDegrees
{
    public static void Main(string[] args)
    {
        // Read input radians
        double radians = double.Parse(Console.ReadLine());

        // Convert radians to degrees
        double degrees = radians * 180 / Math.PI;

        // Print the converted degrees
        Console.WriteLine(degrees);
    }
}
