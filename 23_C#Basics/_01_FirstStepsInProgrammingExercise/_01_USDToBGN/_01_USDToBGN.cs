using System;

public class _01_USDToBGN
{
    public static void Main(string[] args)
    {
        // Read input USD amount
        double usd = double.Parse(Console.ReadLine());

        // Convert USD to BGN
        double bgn = usd * 1.79549;

        // Print the converted amount
        Console.WriteLine(bgn);
    }
}
