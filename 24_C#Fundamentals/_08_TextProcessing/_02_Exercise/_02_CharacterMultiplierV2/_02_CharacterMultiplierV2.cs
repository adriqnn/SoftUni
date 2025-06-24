using System;

public class _02_CharacterMultiplierV2
{
    public static void Main(string[] args)
    {
        // Read input values
        string[] console = Console.ReadLine().Split(" ");

        // Add variables
        string firstWord = console[0];
        string secondWord = console[1];
        int sum = 0;

        // Multiply characters
        int minLength = Math.Min(firstWord.Length, secondWord.Length);
        int maxLength = Math.Max(firstWord.Length, secondWord.Length);

        for (int i = 0; i < minLength; i++)
        {
            sum += firstWord[i] * secondWord[i];
        }

        string longerWord = (firstWord.Length > secondWord.Length) ? firstWord : secondWord;

        for (int i = minLength; i < maxLength; i++)
        {
            sum += longerWord[i];
        }

        // Print result
        Console.WriteLine(sum);
    }
}
