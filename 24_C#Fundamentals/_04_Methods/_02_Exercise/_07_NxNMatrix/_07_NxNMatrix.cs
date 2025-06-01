using System;

public class _07_NxNMatrix
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Create method that prints a number matrix
        printNxN(n);
    }

    private static void printNxN(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                Console.Write(n + " ");
            }

            Console.WriteLine();
        }
    }
}
