using System;

public class _01_UniquePINCodes
{
    public static void Main(string[] args)
    {
        // Read input values
        int num1 = int.Parse(Console.ReadLine());
        int num2 = int.Parse(Console.ReadLine());
        int num3 = int.Parse(Console.ReadLine());

        // Print valid pin codes
        for (int i = 2; i <= num1; i += 2)
        {
            for (int j = 2; j <= num2; j++)
            {
                if (isPrime(j))
                {
                    for (int k = 2; k <= num3; k += 2)
                    {
                        Console.WriteLine($"{i} {j} {k}");
                    }
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
