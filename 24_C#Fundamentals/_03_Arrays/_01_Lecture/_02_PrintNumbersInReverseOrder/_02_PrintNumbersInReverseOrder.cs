using System;

public class _01_HelloSoftUni
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        int[] numbers = new int[n];

        // Reverse the array
        for (int i = n - 1; i >= 0; i--)
        {
            int number = int.Parse(Console.ReadLine());
            numbers[i] = number;
        }

        // Print result
        foreach (int num in numbers)
        {
            Console.Write(num + " ");
        }
    }
}
