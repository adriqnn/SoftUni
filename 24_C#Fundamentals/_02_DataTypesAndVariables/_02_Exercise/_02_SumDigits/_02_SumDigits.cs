using System;

public class _02_SumDigits
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Add variable
        int sum = 0;

        // Sum the numbers
        for (int i = 0; i < console.Length; i++)
        {
            char symbol = console[i];

            int n = symbol - '0';
            sum += n;
        }

        // Print result
        Console.WriteLine(sum);
    }
}
