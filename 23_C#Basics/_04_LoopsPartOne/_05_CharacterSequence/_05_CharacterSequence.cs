using System;

public class _05_CharacterSequence
{
    public static void Main(string[] args)
    {
        // Read input value
        string text = Console.ReadLine();

        // Iterate through each character in the input text and print
        for (int i = 0; i < text.Length; i++)
        {
            // Symbol
            char symbol = text[i];

            Console.WriteLine(symbol);
        }
    }
}
