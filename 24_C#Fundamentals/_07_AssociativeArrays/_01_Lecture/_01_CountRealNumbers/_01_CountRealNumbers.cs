using System;
using System.Collections.Generic;
using System.Linq;

public class _01_CountRealNumbers
{
    public static void Main(string[] args)
    {
        // Read input values
        string[] input = Console.ReadLine().Split(" ");
        double[] nums = input.Select(double.Parse).ToArray();

        // Add variable
        SortedDictionary<double, int> numbers = new SortedDictionary<double, int>();

        // Count numbers
        foreach (double number in nums)
        {
            if (!numbers.ContainsKey(number))
            {
                numbers[number] = 1;
            }
            else
            {
                numbers[number]++;
            }
        }

        // Print result
        foreach (KeyValuePair<double, int> entry in numbers)
        {
            Console.WriteLine($"{entry.Key:0} -> {entry.Value}");
        }
    }
}
