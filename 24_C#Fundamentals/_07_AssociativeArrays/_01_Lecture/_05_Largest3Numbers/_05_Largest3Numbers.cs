using System;

public class _05_Largest3Numbers
{
    public static void Main(string[] args)
    {
        // Read input values
        string[] input = Console.ReadLine().Split(" ");

        // Parse, sort descending, take top 3, and print
        int[] numbers = input.Select(s => int.Parse(s)).ToArray();
        int[] topThree = numbers.OrderByDescending(n => n).Take(3).ToArray();

        // Sort, limit and print result
        foreach (int number in topThree)
        {
            Console.WriteLine(number);
        }
    }
}
