using System;

public class _08_Sunglasses
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Print the sunglasses
        for (int i = 1; i <= n; i++)
        {

            printFrame(n * 2, i);
            printLink(n, i);
            printFrame(n * 2, i);

            Console.WriteLine();
        }
    }

    // Print sides
    public static void printFrame(int n, int i)
    {
        for (int j = 1; j <= n; j++)
        {
            if (j == 1 || i == 1 || j == n || i == n / 2)
            {
                Console.Write("*");
            }
            else
            {
                Console.Write("/");
            }
        }
    }

    // Print middle
    public static void printLink(int n, int i)
    {
        for (int j = 1; j <= n; j++)
        {

            double mid = Math.Ceiling((n * 1.00) / 2);

            if (i == mid)
            {
                Console.Write("|");
            }
            else
            {
                Console.Write(" ");
            }
        }
    }
}
