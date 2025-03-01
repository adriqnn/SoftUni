using System;
using System.Numerics;

public class _02_SumBigNumbers
{
    public static void Main(string[] args)
    {
        // Read input values
        BigInteger one = BigInteger.Parse(Console.ReadLine());
        BigInteger two = BigInteger.Parse(Console.ReadLine());

        // Sum the input values
        BigInteger sum = one + two;

        // Print result
        Console.WriteLine(sum);
    }
}
