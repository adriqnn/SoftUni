using System;

public class _04_LongestIncreasingSubsequence
{
    public static void Main(string[] args)
    {
        // Read input values
        int[] console = Console.ReadLine().Split().Select(int.Parse).ToArray();

        // Add variables
        int[] empty = new int[console.Length];
        Array.Fill(empty, 1);
        int max = 0;

        // End if the length is 1
        if (console.Length <= 1)
        {
            Console.WriteLine(console.Length);
            return;
        }

        // Find the LIS
        for (int i = 1; i < console.Length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (console[j] < console[i] && empty[i] <= empty[j])
                {
                    empty[i] = empty[j] + 1;
                }

                if (max < empty[i])
                {
                    max++;
                }
            }
        }

        // More variables
        int value = 0;
        int sequence = max;
        int[] print = new int[sequence];
        int count = 0;

        // Leftmost LIS
        for (int i = empty.Length - 1; i >= 0; i--)
        {
            if (empty[i] == sequence)
            {
                print[count] = i;
                value = console[i];
            }
        }

        sequence--;
        count++;

        while (sequence != 0)
        {
            for (int i = 0; i < empty.Length; i++)
            {
                if (empty[i] == sequence && console[i] < value)
                {
                    print[count] = i;
                    sequence--;
                    count++;
                    value = console[i];
                    break;
                }
            }
        }

        // Arrange and print the result
        int[] print2 = new int[print.Length];
        for (int i = 0; i < print.Length; i++)
        {
            print2[i] = console[print[i]];
        }

        Array.Sort(print2);
        for (int i = 0; i < print2.Length; i++)
        {
            Console.Write(print2[i] + " ");
        }
    }
}
