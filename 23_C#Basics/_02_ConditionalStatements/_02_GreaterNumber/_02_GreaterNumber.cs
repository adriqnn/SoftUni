using System;

public class _02_GreaterNumber
{
    public static void Main(string[] args)
    {
        // Read the two integers
        int numberOne = int.Parse(Console.ReadLine());
        int numberTwo = int.Parse(Console.ReadLine());

        // Print the greater of the two integers
        Console.WriteLine(Math.Max(numberOne, numberTwo));
    }
}
