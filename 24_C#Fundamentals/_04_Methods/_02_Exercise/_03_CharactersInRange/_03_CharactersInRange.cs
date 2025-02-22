using System;

public class _03_CharactersInRange
{
    public static void Main(string[] args)
    {
        // Read input values
        char charOne = Console.ReadLine()[0];
        char charTwo = Console.ReadLine()[0];

        // Create method that prints ASCII chars in a given range
        printThis(charOne, charTwo);
    }

    private static void printThis(char charOne, char charTwo)
    {
        for (int i = Math.Min(charOne, charTwo) + 1; i < Math.Max(charOne, charTwo); i++)
        {
            Console.Write((char)i + " ");
        }
    }
}
