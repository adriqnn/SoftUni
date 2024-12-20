using System;

public class _04_SumOfTwoNumbers
{
    public static void Main(string[] args)
    {
        // Read input values
        int start = int.Parse(Console.ReadLine());
        int end = int.Parse(Console.ReadLine());
        int magicNum = int.Parse(Console.ReadLine());

        // Add variables
        int count = 0;
        bool isDone = false;

        // Cycle from start to end and search for the magic number
        for (int i = start; i <= end; i++)
        {
            for (int j = start; j <= end; j++)
            {
                count++;

                // Print result if magic number is found
                if (i + j == magicNum)
                {
                    Console.WriteLine($"Combination N:{count} ({i} + {j} = {i + j})");
                    isDone = true;
                    break;
                }
            }

            if (isDone)
            {
                break;
            }
        }

        // Print result
        if (!isDone)
        {
            Console.WriteLine($"{count} combinations - neither equals {magicNum}");
        }
    }
}
