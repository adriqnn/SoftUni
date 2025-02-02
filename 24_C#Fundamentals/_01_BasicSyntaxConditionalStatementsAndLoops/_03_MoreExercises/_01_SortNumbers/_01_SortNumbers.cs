using System;

public class _01_SortNumbers
{
    public static void Main(string[] args)
    {
        // Add variable
        List<int> numbers = new List<int>();

        // Read input values
        for (int i = 0; i < 3; i++)
        {
            int n = int.Parse(Console.ReadLine());
            numbers.Add(n);
        }

        // Print result
        numbers.OrderByDescending(n => n).ToList().ForEach(Console.WriteLine);
    }
}
