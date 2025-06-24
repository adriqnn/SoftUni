using System;

public class _02_CharacterMultiplier
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
        if (firstWord.Length > secondWord.Length)
        {
            for (int i = 0; i < secondWord.Length; i++)
            {
                sum += firstWord[i] * secondWord[i];
            }

            for (int i = secondWord.Length; i < firstWord.Length; i++)
            {
                sum += firstWord[i];
            }
        }
        else if (firstWord.Length < secondWord.Length)
        {
            for (int i = 0; i < firstWord.Length; i++)
            {
                sum += firstWord[i] * secondWord[i];
            }

            for (int i = firstWord.Length; i < secondWord.Length; i++)
            {
                sum += secondWord[i];
            }
        }
        else
        {
            for (int i = 0; i < secondWord.Length; i++)
            {
                sum += firstWord[i] * secondWord[i];
            }
        }

        // Print result
        Console.WriteLine(sum);
    }
}
