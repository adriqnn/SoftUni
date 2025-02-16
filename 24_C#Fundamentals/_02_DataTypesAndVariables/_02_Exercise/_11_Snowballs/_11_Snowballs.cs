using System;
using System.Numerics;

public class _11_Snowballs
{
    public static void Main(string[] args)
    {
        // Read input value
        int numberOfSnowballs = int.Parse(Console.ReadLine());

        // Add variables
        BigInteger max = 0;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;
        BigInteger maxSnowballValue = 0;

        // Determine which one is the best snowball
        for (int i = 0; i < numberOfSnowballs; i++)
        {
            int snowballSnow = int.Parse(Console.ReadLine());
            int snowballTime = int.Parse(Console.ReadLine());
            int snowballQuality = int.Parse(Console.ReadLine());
            BigInteger snowballValue = BigInteger.Pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > max)
            {
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
                maxSnowballValue = snowballValue;
                max = snowballValue;
            }
        }

        // Print result
        Console.WriteLine($"{maxSnowballSnow} : {maxSnowballTime} = {maxSnowballValue:F0} ({maxSnowballQuality})");
    }
}
