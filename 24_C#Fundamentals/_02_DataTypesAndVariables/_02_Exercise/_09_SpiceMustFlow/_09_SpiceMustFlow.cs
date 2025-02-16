using System;

public class _09_SpiceMustFlow
{
    public static void Main(string[] args)
    {
        // Read input value
        int startingYieldOfSource = int.Parse(Console.ReadLine());

        // Add variables
        int yield = 0;
        int days = 0;

        // Calculate the yield of the source
        while (startingYieldOfSource >= 100)
        {
            yield += startingYieldOfSource;
            startingYieldOfSource -= 10;

            days++;
            yield -= 26;
        }

        // Yield check for additional days
        if (yield >= 26)
        {
            yield -= 26;
        }

        // Print result
        Console.WriteLine(days);
        Console.WriteLine(yield);
    }
}
