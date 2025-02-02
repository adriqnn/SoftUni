using System;

public class _08_TriangleOfNumbers
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Print triangle of numbers
        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                Console.Write(i + " ");
            }

            Console.WriteLine();
        }
    }
}
