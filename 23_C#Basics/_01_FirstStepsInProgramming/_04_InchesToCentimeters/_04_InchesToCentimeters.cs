using System;

public class _04_InchesToCentimeters
{
    public static void Main(string[] args)
    {
        // Read input value in inches
        double inches = double.Parse(Console.ReadLine());

        // Convert inches to centimeters
        double centimeters = inches * 2.54;

        // Print the result in centimeters
        Console.WriteLine(centimeters);
    }
}
