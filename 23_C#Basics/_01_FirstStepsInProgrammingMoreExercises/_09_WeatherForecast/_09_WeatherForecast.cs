using System;

public class _09_WeatherForecast
{
    public static void Main(string[] args)
    {
        // Read the weather type input
        string weatherType = Console.ReadLine();

        // Determine and print the appropriate message
        Console.WriteLine(weatherType.Equals("sunny") ? "It's warm outside!" : "It's cold outside!");
    }
}
