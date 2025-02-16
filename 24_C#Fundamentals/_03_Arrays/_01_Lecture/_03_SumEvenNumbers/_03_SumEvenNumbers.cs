using System;

public class _01_HelloSoftUni
{
    public static void Main(string[] args)
    {
        // Read input values
        int[] numbers = Console.ReadLine().Split(new char[] {' '}, StringSplitOptions.RemoveEmptyEntries).Select(x => int.Parse(x)).ToArray();

        // Add variable
        int sum = 0;

        // Calculate sum
        for (int i = 0; i < numbers.Length; i++)
        {
            if (numbers[i] % 2 == 0)
            {
                sum += numbers[i];
            }
        }

        // Print result
        Console.WriteLine(sum);
    }
}
