using System;

public class _13_PrimePairs
{
    public static void Main(string[] args)
    {
        // Read input values
        int firstNumberStart = int.Parse(Console.ReadLine());
        int secondNumberStart = int.Parse(Console.ReadLine());
        int firstNumberEnd = int.Parse(Console.ReadLine());
        int secondNumberEnd = int.Parse(Console.ReadLine());

        // Determine the prime pairs numbers and print them
        for (int i = firstNumberStart; i <= firstNumberStart + firstNumberEnd; i++)
        {
            for (int j = secondNumberStart; j <= secondNumberStart + secondNumberEnd; j++)
            {
                if (isPrime(i) && isPrime(j))
                {
                    Console.WriteLine($"{i}{j}");
                }
            }
        }
    }

    // Function to check if a number is prime
    public static bool isPrime(int number)
    {
        if (number <= 1)
        {
            return false;
        }

        // Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.Sqrt(number); i++)
        {
            if (number % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
