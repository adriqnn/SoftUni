using System;

public class _07_WaterOverflow
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        int capacity = 0;

        // Determine the capacity
        for (int i = 0; i < n; i++)
        {
            int liters = int.Parse(Console.ReadLine());

            if (capacity + liters > 255)
            {
                Console.WriteLine("Insufficient capacity!");
                continue;
            }

            capacity += liters;
        }

        // Print result
        Console.WriteLine(capacity);
    }
}
