using System;

public class _07_SumNumbers
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        int sum = 0;

        // Sum all the numbers for the n loop
        for (int i = 1; i <= n; i++)
        {
            int currentNum = int.Parse(Console.ReadLine());
            sum += currentNum;
        }

        // Print the sum of numbers
        Console.WriteLine(sum);
    }
}
