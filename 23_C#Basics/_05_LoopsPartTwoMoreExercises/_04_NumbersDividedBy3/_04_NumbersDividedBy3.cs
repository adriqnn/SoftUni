using System;

public class _04_NumbersDividedBy3
{
    public static void Main(string[] args)
    {
        // Print numbers from 1 to 100 that are divisible by 3
        for (int i = 1; i < 100; i++)
        {
            if (i % 3 == 0)
            {
                Console.WriteLine(i);
            }
        }
    }
}
