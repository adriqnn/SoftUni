using System;

public class _07_CondenseArrayToNumber
{
    public static void Main(string[] args)
    {
        // Raed input values
        int[] numbers = Console.ReadLine().Split().Select(int.Parse).ToArray();

        // Condense the array
        while (numbers.Length > 1)
        {
            int[] condensed = new int[numbers.Length - 1];

            for (int i = 0; i < numbers.Length - 1; i++)
            {
                condensed[i] = numbers[i] + numbers[i + 1];

            }

            numbers = condensed;
        }

        // Print result
        Console.WriteLine(numbers[0]);
    }
}
