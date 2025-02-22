using System;

public class _10_TopNumber
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Create method that determines the top numbers
        topNUmber(n);
    }

    private static void topNUmber(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            int number = i;
            int sum = 0;
            bool hasOdd = false;

            while (number != 0)
            {
                if (number % 2 != 0)
                {
                    hasOdd = true;
                }

                sum += number % 10;
                number /= 10;
            }

            if (sum % 8 == 0 && hasOdd)
            {
                Console.WriteLine(i);
            }
        }
    }
}
