using System;

public class _03_SumPrimeNonPrime
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Add variables
        int primeSum = 0;
        int nonPrimeSum = 0;

        // Calculate prime and non-prime sums
        while (!console.Equals("stop"))
        {
            bool isPrime = true;
            int num = int.Parse(console);

            if (num < 0)
            {
                Console.WriteLine("Number is negative.");
            }
            else
            {
                if (num <= 1)
                {
                    isPrime = false;
                }
                else
                {
                    for (int i = 2; i <= Math.Sqrt(num); i++)
                    {
                        if (num % i == 0)
                        {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime)
                {
                    primeSum += num;
                }
                else
                {
                    nonPrimeSum += num;
                }
            }

            console = Console.ReadLine();
        }

        // Print result
        Console.WriteLine($"Sum of all prime numbers is: {primeSum}");
        Console.WriteLine($"Sum of all non prime numbers is: {nonPrimeSum}");
    }
}
