using System;

public class _03_CelsiusToFahrenheit
{
    public static void Main(string[] args)
    {
        // Read input temperature in Celsius
        double degreesInCelsius = double.Parse(Console.ReadLine());

        // Convert Celsius to Fahrenheit
        double turnCelsiusToFahrenheit = (degreesInCelsius * 9 / 5) + 32;

        // Print the converted temperature in Fahrenheit
        Console.WriteLine("{0:F2}\n", turnCelsiusToFahrenheit);
    }
}
