using System;

public class _06_NumberInRange
{
    public static void Main(string[] args)
    {
        // Read input value
        int number = int.Parse(Console.ReadLine());

        // Set a range for the check
        const int MIN_RANGE = -100;
        const int MAX_RANGE = 100;

        // Check if the number is in the set range and print the result
        if (number >= MIN_RANGE && number <= MAX_RANGE && number != 0)
        {
            Console.WriteLine("Yes");
        }
        else
        {
            Console.WriteLine("No");
        }
    }
}
