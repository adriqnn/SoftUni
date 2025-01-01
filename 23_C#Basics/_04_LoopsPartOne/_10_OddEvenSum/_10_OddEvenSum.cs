using System;

public class _10_OddEvenSum
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        int sumEven = 0;
        int sumOdd = 0;

        // Loop through the n sequence of numbers and sum even and odd numbers
        for (int i = 1; i <= n; i++)
        {
            int num = int.Parse(Console.ReadLine());

            if (i % 2 == 0)
            {
                // Add even-indexed numbers to sumEven
                sumEven += num;
            }
            else
            {
                // Add odd-indexed numbers to sumOdd
                sumOdd += num;
            }
        }

        // Compare the sums and print the result
        if (sumEven == sumOdd)
        {
            Console.WriteLine($"Yes\n Sum = {sumEven}");
        }
        else
        {
            Console.WriteLine($"No \n Diff = {Math.Abs(sumEven - sumOdd)}");
        }
    }
}
