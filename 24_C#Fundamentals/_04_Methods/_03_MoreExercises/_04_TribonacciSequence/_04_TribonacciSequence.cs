using System;

public class _04_TribonacciSequence
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Print tribonacci sequence
        tribonacciSequence(n);
    }

    private static void tribonacciSequence(int n)
    {
        int n1 = 1;
        int n2 = 1;
        int n3 = 2;

        if (n == 0)
        {
            Console.Write("0 ");
            return;
        }

        if (n == 1)
        {
            Console.Write("1 ");
            return;
        }

        if (n == 2)
        {
            Console.Write("1 1 ");
            return;
        }

        Console.Write("1 ");
        Console.Write("1 ");

        for (int i = 3; i <= n; i++)
        {
            int temp1 = n1;
            int temp2 = n2;

            Console.Write(n3 + " ");

            n1 = n2;
            n2 = n3;

            n3 += temp1 + temp2;
        }
    }
}
