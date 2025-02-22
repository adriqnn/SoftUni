using System;

public class _06_MiddleCharacters
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Create method that prints the middle of a string
        middleString(console);
    }

    private static void middleString(string console)
    {
        if (console.Length % 2 == 0)
        {
            char middleEvenOne = console[(console.Length / 2) - 1];
            char middleEvenTwo = console[console.Length / 2];

            Console.WriteLine($"{middleEvenOne}{middleEvenTwo}");
        }
        else
        {
            char middleOdd = console[console.Length / 2];

            Console.WriteLine(middleOdd);
        }
    }
}
