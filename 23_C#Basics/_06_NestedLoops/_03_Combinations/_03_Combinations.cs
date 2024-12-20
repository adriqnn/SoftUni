using System;

public class _03_Combinations
{
    public static void Main(string[] args)
    {
        // Read input value
        int num = int.Parse(Console.ReadLine());

        // Add variable
        int count = 0;

        for (int i = 0; i <= num; i++)
        {
            for (int j = 0; j <= num; j++)
            {
                for (int k = 0; k <= num; k++)
                {
                    if (i + j + k == num)
                    {
                        count++;
                    }
                }
            }
        }

        // Print the result
        Console.WriteLine(count);
    }
}
