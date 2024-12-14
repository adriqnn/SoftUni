using System;

public class _02_HalfSumElement
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        int nSum = 0;
        int maxNum = int.MinValue;

        // Read integers and find the maximum
        for (int i = 1; i <= n; i++)
        {
            // Read new input value
            int num = int.Parse(Console.ReadLine());

            if (num > maxNum)
            {
                maxNum = num;
            }
            nSum += num;
        }

        int element = nSum - maxNum;

        // Compare the sums and print the result
        if (element == maxNum)
        {
            Console.WriteLine($"Yes\nSum = {maxNum}");
        }
        else
        {
            Console.WriteLine($"No\nDiff = {Math.Abs(element - maxNum)}");
        }
    }
}
