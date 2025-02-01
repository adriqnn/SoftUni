using System;

public class _09_SumOfOddNumbers
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        int sum = 0;

        // Sum odd numbers
        for (int i = 1; i < n * 2; i += 2)
        {
            sum += i;
            Console.WriteLine(i);
        }

        // Print Result
        Console.WriteLine("Sum: " + sum);
    }
}
