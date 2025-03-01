using System;
using System.Numerics;

public class _03_BigFactorial
{
    public static void Main(string[] args)
    {
        // Read input value
        int factorial = int.Parse(Console.ReadLine());

        // Add variable
        BigInteger result = BigInteger.One;

        // Determine the factorial of the input
        for (int i = 1; i <= factorial; i++)
        {
            result *= i;
        }

        // Print result
        Console.WriteLine(result);
    }
}
