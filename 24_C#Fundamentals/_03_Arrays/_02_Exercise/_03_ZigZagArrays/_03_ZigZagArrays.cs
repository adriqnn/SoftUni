using System;

public class _03_ZigZagArrays
{
    public static void Main(string[] args)
    {
        // Read input values
        int n = int.Parse(Console.ReadLine());
        int[] numbersArrayOne = new int[n];
        int[] numbersArrayTwo = new int[n];

        // Gather arrays in the selected pattern from the input values
        for (int i = 0; i < n; i++)
        {
            int[] line = Console.ReadLine().Split().Select(int.Parse).ToArray();

            if (i % 2 == 0)
            {
                numbersArrayOne[i] = line[0];
                numbersArrayTwo[i] = line[1];
            }
            else
            {
                numbersArrayOne[i] = line[1];
                numbersArrayTwo[i] = line[0];
            }
        }

        // Print result
        Console.WriteLine(string.Join(" ", numbersArrayOne));
        Console.WriteLine(string.Join(" ", numbersArrayTwo));
    }
}
