using System;

public class _04_TriangleOfDollars
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Print a triangle of $ signs
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                Console.Write("$ ");
            }

            Console.WriteLine();
        }
    }
}
