using System;

public class _08_LowerOrUpper
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Add variable
        char symbol = console[0];

        // Print result
        Console.WriteLine(symbol >= 97 ? "lower-case" : "upper-case");
    }
}
