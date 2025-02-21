using System;

public class _01_SignOfIntegerNumbers
{
    public static void Main(string[] args)
    {
        // Read input value
        int num = int.Parse(Console.ReadLine());

        // Create method to determine the char sign
        whatIsTheSign(num);
    }

    private static void whatIsTheSign(int num)
    {
        if (num == 0)
        {
            Console.WriteLine("The number 0 is zero.");
        }
        else if (num > 0)
        {
            Console.WriteLine($"The number {num} is positive.");
        }
        else
        {
            Console.WriteLine($"The number {num} is negative.");
        }
    }
}
