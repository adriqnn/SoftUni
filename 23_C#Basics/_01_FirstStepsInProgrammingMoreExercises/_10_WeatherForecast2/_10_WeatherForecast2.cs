using System;

public class _10_WeatherForecast2
{
    public static void Main(string[] args)
    {
        // Read the temperature input
        double degrees = double.Parse(Console.ReadLine());
        String weatherType = "";

        // Categorize weather based on temperature ranges
        if (degrees >= 5.00 && degrees <= 11.9)
        {
            weatherType = "Cold";
        }
        else if (degrees >= 12.00 && degrees <= 14.9)
        {
            weatherType = "Cool";
        }
        else if (degrees >= 15.00 && degrees <= 20.00)
        {
            weatherType = "Mild";
        }
        else if (degrees >= 20.1 && degrees <= 25.9)
        {
            weatherType = "Warm";
        }
        else if (degrees >= 26.00 && degrees <= 35.00)
        {
            weatherType = "Hot";
        }
        else
        {
            weatherType = "unknown";
        }

        // Print the weather type
        Console.WriteLine(weatherType);
    }
}
