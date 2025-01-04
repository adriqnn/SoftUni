using System;

public class _07_SafePasswordsGenerator
{
    public static void Main(string[] args)
    {
        // Read input values
        int a = int.Parse(Console.ReadLine());
        int b = int.Parse(Console.ReadLine());
        int max = int.Parse(Console.ReadLine());

        // Add variables
        char A = '#';
        char B = '@';
        int count = 0;
        bool breakOuter = false;

        for (int i = 1; i <= a && !breakOuter; i++)
        {
            for (int j = 1; j <= b; j++)
            {
                if (count == max)
                {
                    breakOuter = true;
                    break; // Break inner loop
                }

                if (A == 56)
                {
                    A = '#';
                }

                if (B == 97)
                {
                    B = '@';
                }

                Console.Write($"{A}{B}{i}{j}{B++}{A++}|");
                count++;
            }
        }
    }
}
