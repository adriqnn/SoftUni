using System;

public class _02_PascalTriangle
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Print pascal triangle
        for (int i = 0; i < n; i++)
        {
            int number = 1;

            for (int j = 0; j <= i; j++)
            {
                Console.Write(number + " ");
                number = number * (i - j) / (j + 1);
            }

            Console.WriteLine();
        }
    }
}
