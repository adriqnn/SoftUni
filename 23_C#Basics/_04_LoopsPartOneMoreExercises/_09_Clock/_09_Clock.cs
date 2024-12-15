using System;

public class _09_Clock
{
    public static void Main(string[] args)
    {
        // Print time
        for (int i = 0; i < 24; i++)
        {
            for (int j = 0; j < 60; j++)
            {
                Console.WriteLine($"{i} : {j}");
            }
        }
    }
}
