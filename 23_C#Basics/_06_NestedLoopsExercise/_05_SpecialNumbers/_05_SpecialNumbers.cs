using System;

public class _05_SpecialNumbers
{
    public static void Main(string[] args)
    {
        // Read input value
        int num = int.Parse(Console.ReadLine());

        // Print all the special numbers
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= 9; j++)
            {
                for (int k = 1; k <= 9; k++)
                {
                    for (int l = 1; l <= 9; l++)
                    {
                        if (num % i == 0 && num % j == 0 && num % k == 0 && num % l == 0)
                        {
                            Console.Write($"{i}{j}{k}{l} ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
