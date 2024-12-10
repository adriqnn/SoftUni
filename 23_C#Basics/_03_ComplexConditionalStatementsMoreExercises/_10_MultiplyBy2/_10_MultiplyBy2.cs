using System;

public class _10_MultiplyBy2
{
    public static void Main(string[] args)
    {
        // Read input value
        double number = double.Parse(Console.ReadLine());

        // Multiply the number by 2 and print while it's non-negative
        while (number >= 0)
        {
            double result = number * 2;
            Console.WriteLine($"Result: {result:F2}");

            number = double.Parse(Console.ReadLine());
        }

        // End the program if the number is below 0
        if (number < 0)
        {
            Console.WriteLine("Negative number!");
        }
    }
}
