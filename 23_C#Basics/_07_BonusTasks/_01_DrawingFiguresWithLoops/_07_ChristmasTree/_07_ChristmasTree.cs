using System;

public class _07_ChristmasTree
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Print the tree
        for (int i = 1; i <= n + 1; i++)
        {
            printRowOfAFigure(n + 1, i);

            Console.WriteLine();
        }
    }

    public static void printRowOfAFigure(int n, int i)
    {

        // Print spaces
        for (int j = 1; j <= n - i; j++)
        {
            Console.Write(" ");
        }

        // Print stars in each row
        for (int k = 1; k <= 2 * i - 1; k++)
        {
            if (k == i)
            {
                Console.Write(" | ");
            }
            else
            {
                Console.Write("*");
            }
        }
    }
}
