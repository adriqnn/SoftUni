using System;

public class _08_NumberSequence
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Stage the default
        int maxNum = int.MinValue;
        int minNum = int.MaxValue;

        // Find the max and min numbers in the n sequence
        for (int i = 1; i <= n; i++)
        {
            int currentNum = int.Parse(Console.ReadLine());

            if (currentNum > maxNum)
            {
                maxNum = currentNum;
            }

            if (currentNum < minNum)
            {
                minNum = currentNum;
            }
        }

        // Print the max and the min numbers
        Console.WriteLine($"Max number: {maxNum}");
        Console.WriteLine($"Min number: {minNum}");
    }
}
