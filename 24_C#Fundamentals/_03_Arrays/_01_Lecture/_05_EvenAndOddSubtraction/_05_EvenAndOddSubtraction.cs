using System;

public class _05_EvenAndOddSubtraction
{
    public static void Main(string[] args)
    {
        // Read input values
        int[] numbers = Console.ReadLine().Split(new char[] {' '}, StringSplitOptions.RemoveEmptyEntries).Select(x => int.Parse(x)).ToArray();

        // Add variables
        int sumEven = 0;
        int sumOdd = 0;

        // Calculate sums for even and odd
        for (int i = 0; i < numbers.Length; i++)
        {
            if (numbers[i] % 2 == 0)
            {
                sumEven += numbers[i];
            }
            else
            {
                sumOdd += numbers[i];
            }
        }

        // Print result
        Console.WriteLine(sumEven - sumOdd);
    }
}
