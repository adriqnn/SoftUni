using System;

public class _05_Number100Or200
{
    public static void Main(string[] args)
    {
        // Read the number input
        int number = int.Parse(Console.ReadLine());

        // Categorize the number based on its value
        if (number < 100)
        {
            Console.WriteLine("Less than 100");
        }
        else if (number <= 200)
        {
            Console.WriteLine("Between 100 and 200");
        }
        else
        {
            Console.WriteLine("Greater than 200");
        }
    }
}
