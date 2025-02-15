using System;

public class _01_HelloSoftUni
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        int sum = 0;

        // Sum the chars
        for (int i = 0; i < n; i++)
        {
            char symbol = Console.ReadLine()[0];
            sum += symbol;
        }

        // Print result
        Console.WriteLine("The sum equals: " + sum);
    }
}
