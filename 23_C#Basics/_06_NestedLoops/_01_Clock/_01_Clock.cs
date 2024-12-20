using System;

public class _01_Clock
{
    public static void Main(string[] args)
    {
        // Print the time
        for (int h = 0; h <= 23; h++)
        {
            for (int m = 0; m <= 59; m++)
            {
                Console.WriteLine($"{h}:{m}");
            }
        }
    }
}
