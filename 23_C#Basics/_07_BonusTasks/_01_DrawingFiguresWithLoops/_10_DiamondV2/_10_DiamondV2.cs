using System;

public class _10_DiamondV2
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        for (int i = 1; i <= n; i++)
        {
            // Print upper triangle lines
            printRowOfAFigure(n, i);
            // Move to the next line
            Console.WriteLine();
        }

        // Lower triangle
        for (int i = n - 1; i >= 1; i--)
        {
            // Print lower triangle lines
            printRowOfAFigure(n, i);
            // Move to the next line
            Console.WriteLine();
        }
    }

    public static void printRowOfAFigure(int n, int i)
    {
        // Print spaces
        for (int j = 1; j <= n - i; j++)
        {
            Console.Write("-");
        }

        // Print stars in each row
        for (int k = 1; k <= 2 * i - 1; k++)
        {
            if (k == 1 || k == 2 * i - 1)
            {
                Console.Write("*");
            }
            else
            {
                Console.Write("-");
            }
        }

        // Print spaces
        for (int j = 1; j <= n - i; j++)
        {
            Console.Write("-");
        }
    }
}
