using System;

public class _08_SecretDoorsLock
{
    public static void Main(string[] args)
    {
        // Read input values
        int hundredsLimit = int.Parse(Console.ReadLine());
        int tensLimit = int.Parse(Console.ReadLine());
        int unitsLimit = int.Parse(Console.ReadLine());

        // Print all the possible combinations within the given limitations
        for (int i = 2; i <= hundredsLimit; i += 2)
        {
            for (int j = 1; j <= tensLimit; j++)
            {
                if (IsPrime(j))
                {
                    for (int k = 2; k <= unitsLimit; k += 2)
                    {
                        Console.WriteLine($"{i} {j} {k}");
                    }
                }
            }
        }
    }

    public static bool IsPrime(int number)
    {
        if (number <= 1)
        {
            return false;
        }

        // Check for divisibility from 2 up to the square root of the number
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
