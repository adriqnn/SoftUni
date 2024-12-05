using System;

public class _10_InvalidNumber
{
    public static void Main(string[] args)
    {
        // Read input value
        int number = int.Parse(Console.ReadLine());

        // Check if the number is valid or invalid
        bool isValid = (number >= 100 && number <= 200 || number == 0);

        // Print only if the number is invalid
        if (!isValid)
        {
            Console.WriteLine("invalid");
        }
    }
}

