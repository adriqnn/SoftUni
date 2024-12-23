using System;

public class _09_SumOfTwoNumbers
{
    public static void Main(string[] args)
    {
        // Read input values
        int startOfInterval = int.Parse(Console.ReadLine());
        int endOfInterval = int.Parse(Console.ReadLine());
        int magicNumber = int.Parse(Console.ReadLine());

        // Add variables
        int combinations = 0;
        bool magicNumberFound = false;

        // Find the combination, if any
        for (int i = startOfInterval; i <= endOfInterval && !magicNumberFound; i++)
        {
            for (int j = startOfInterval; j <= endOfInterval; j++)
            {
                combinations++;
                int sum = i + j;

                if (sum == magicNumber)
                {
                    magicNumberFound = true;
                    Console.WriteLine($"Combination N:{combinations} ({i} + {j} = {sum})");
                    break;  // breaks out of the inner loop
                }
            }
        }

        // Print a message if the magic number wasn't found
        if (!magicNumberFound)
        {
            Console.WriteLine($"{combinations} combinations - neither equals {magicNumber}");
        }
    }
}
