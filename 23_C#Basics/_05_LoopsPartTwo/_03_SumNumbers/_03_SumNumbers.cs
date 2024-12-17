using System;

public class _03_SumNumbers
{
    public static void Main(string[] args)
    {
        // Read input value
        int initialNum = int.Parse(Console.ReadLine());

        int sum = 0;

        // Use a while loop to continuously read numbers and add them to the sum
        while (sum < initialNum)
        {
            int currentNum = int.Parse(Console.ReadLine());
            sum += currentNum;
        }

        // Display the final sum
        Console.WriteLine(sum);
    }
}
