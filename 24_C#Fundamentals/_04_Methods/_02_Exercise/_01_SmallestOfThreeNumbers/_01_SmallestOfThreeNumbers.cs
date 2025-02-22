using System;

public class _01_SmallestOfThreeNumbers
{
    public static void Main(string[] args)
    {
        // Read input values
        int n1 = int.Parse(Console.ReadLine());
        int n2 = int.Parse(Console.ReadLine());
        int n3 = int.Parse(Console.ReadLine());

        // Create method to determine the smallest number out of three numbers
        printBiggestNumber(n1, n2, n3);
    }

    private static void printBiggestNumber(int n1, int n2, int n3)
    {
        Console.WriteLine(Math.Min(n1, (Math.Min(n2, n3))));
    }
}
