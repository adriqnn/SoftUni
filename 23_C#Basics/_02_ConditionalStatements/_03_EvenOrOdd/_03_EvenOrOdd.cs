using System;

public class _03_EvenOrOdd
{
    public static void Main(string[] args)
    {
        // Read the number input
        int number = int.Parse(Console.ReadLine());

        // Determine if the number is even or odd
        if (number % 2 == 0)
        {
            Console.WriteLine("even");
        }
        else
        {
            Console.WriteLine("odd");
        }
    }
}
