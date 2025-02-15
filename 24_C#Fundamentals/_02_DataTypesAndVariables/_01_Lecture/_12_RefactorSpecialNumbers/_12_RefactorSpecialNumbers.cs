using System;

public class _12_RefactorSpecialNumbers
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Find special number
        for (int i = 1; i <= n; i++)
        {
            int num = i;
            int sum = 0;

            while (num != 0)
            {
                sum += num % 10;
                num /= 10;
            }

            // Print result
            if (sum == 5 || sum == 7 || sum == 11)
            {
                Console.WriteLine($"{i} -> True");
            }
            else
            {
                Console.WriteLine($"{i} -> False");
            }
        }
    }
}
