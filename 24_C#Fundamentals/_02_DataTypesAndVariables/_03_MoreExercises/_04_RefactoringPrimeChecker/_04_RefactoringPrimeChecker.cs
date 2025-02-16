using System;

public class _04_RefactoringPrimeChecker
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Check if the number is prime or not
        for (int i = 2; i <= n; i++)
        {
            bool isPrime = true;

            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            // Print result
            Console.WriteLine($"{i} -> {isPrime.ToString().ToLower()}");
        }
    }
}
