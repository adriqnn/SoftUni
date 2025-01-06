using System;

public class _10_Diamond
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variables
        int upper = (int)Math.Ceiling(n / 2.00);
        int lower = n - upper - (n % 2 == 0 ? 1 : 0);

        // Upper triangle
        for (int i = 1; i <= upper; i++)
        {
            printTopPart(n, i);
            Console.WriteLine();
        }

        // Lower triangle
        for (int i = lower; i >= 1; i--)
        {
            printTopPart(n, i);
            Console.WriteLine();
        }
    }

    public static void printTopPart(int n, int i)
    {
        int stars = n % 2 != 0 ? 1 : 2;

        if (i == 1 || i == n)
        {
            for (int j = 1; j <= Math.Ceiling(n / 2.00 - 1); j++)
            {
                Console.Write("-");
            }

            Console.Write(new string('*', stars));

            for (int j = 1; j <= Math.Ceiling(n / 2.00 - 1); j++)
            {
                Console.Write("-");
            }
        }
        else
        {
            int locationRight = ((n / 2) + i);

            if (n % 2 != 0)
            {
                int locationLeft = ((n / 2) + 2 - i);

                for (int j = 1; j <= n; j++)
                {
                    if (j == locationLeft || j == locationRight)
                    {
                        Console.Write("*");
                    }
                    else
                    {
                        Console.Write("-");
                    }
                }
            }
            else
            {
                int locationLeft = ((n / 2) + 1 - i);

                for (int j = 1; j <= n; j++)
                {
                    if (j == locationLeft || j == locationRight)
                    {
                        Console.Write("*");
                    }
                    else
                    {
                        Console.Write("-");
                    }
                }
            }
        }
    }
}
