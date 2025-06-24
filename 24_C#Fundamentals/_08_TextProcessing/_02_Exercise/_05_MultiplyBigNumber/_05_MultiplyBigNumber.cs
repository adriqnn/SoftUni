using System;
using System.Numerics;

public class _05_MultiplyBigNumber
{
    public static void Main(string[] args)
    {
        // Read input values
        BigInteger one = BigInteger.Parse(Console.ReadLine());
        BigInteger two = BigInteger.Parse(Console.ReadLine());

        // Print result
        Console.WriteLine(one * two);
    }
}
