using System;

public class _07_FoldAndSumV2
{
    public static void Main(string[] args)
    {
        // Read input values
        int[] arr = Console.ReadLine().Split().Select(int.Parse).ToArray();

        // Add variables
        int n = arr.Length / 4;
        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++)
        {
            result[i] = arr[n - 1 - i] + arr[n + i];
            result[i + n] = arr[arr.Length - 1 - i] + arr[2 * n + i];
        }

        // Print the resulting sums
        Console.WriteLine(string.Join(" ", result));
    }
}
