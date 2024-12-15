using System;

public class _10_Clock2
{
    public static void Main(string[] args)
    {
        // Print time
        for (int i = 0; i < 24; i++)
        {
            for (int j = 0; j < 60; j++)
            {
                for (int k = 0; k < 60; k++)
                {
                    Console.WriteLine($"{i} : {j} : {k}");
                }
            }
        }
    }
}
