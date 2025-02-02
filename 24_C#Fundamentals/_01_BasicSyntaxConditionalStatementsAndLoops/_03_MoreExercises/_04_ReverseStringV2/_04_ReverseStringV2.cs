using System;

public class _04_ReverseStringV2
{
    public static void Main(string[] args)
    {
        // Read input value and reverse
        string[] reversed = Console.ReadLine().ToCharArray().Reverse().ToArray();

        // Print result
        Console.WriteLine(reversed);
    }
}
