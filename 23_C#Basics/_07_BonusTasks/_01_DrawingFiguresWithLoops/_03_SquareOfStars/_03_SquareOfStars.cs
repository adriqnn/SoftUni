using System;

public class _03_SquareOfStars
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Print a square nxn of stars with spaces
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                Console.Write("* ");
            }

            Console.WriteLine();
        }
    }
}
