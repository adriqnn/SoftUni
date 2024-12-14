using System;

public class _09_LeftAndRightSum
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        int leftSum = 0;
        int rightSum = 0;

        // Read and calculate the sum of the left sequence
        for (int i = 1; i <= n; i++)
        {
            int currentNum = int.Parse(Console.ReadLine());
            leftSum += currentNum;
        }

        // Read and calculate the sum of the right sequence
        for (int i = 1; i <= n; i++)
        {
            int currentNum = int.Parse(Console.ReadLine());
            rightSum += currentNum;
        }

        // Compare the sums and print the result
        if (leftSum == rightSum)
        {
            Console.WriteLine($"Yes, sum = {rightSum}");
        }
        else
        {
            Console.WriteLine($"No, diff = {Math.Abs(leftSum - rightSum)}");
        }
    }
}
