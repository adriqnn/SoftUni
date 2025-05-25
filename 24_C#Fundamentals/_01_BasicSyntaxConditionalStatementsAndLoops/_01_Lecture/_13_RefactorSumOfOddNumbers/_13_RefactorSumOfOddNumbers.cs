using System;

public class _13_RefactorSumOfOddNumbers
{
    public static void Main(string[] args)
    {
        // Read input value from the console
        int n = int.Parse(Console.ReadLine());

        // Add variable
        int sum = 0;

        // Sum all the odd numbers and print each odd number
        for (int i = 1; i < n * 2; i += 2)
        {
            sum += i;
            Console.WriteLine(i);
        }

        // Print the sum of odd numbers
        Console.WriteLine("Sum: " + sum);
    }
}
