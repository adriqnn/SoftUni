using System;
using System.Text;

public class _02_RepeatStrings
{
    public static void Main(string[] args)
    {
        // Read input values
        string[] console = Console.ReadLine().Split(" ");

        // Repeat string
        foreach (string word in console)
        {
            string repeatedWord = repeatWord(word, word.Count());

            // Print result
            Console.Write(repeatedWord);
        }
    }

    // Method that concatenates a string multiple times
    private static string repeatWord(string word, int times)
    {
        var result = new StringBuilder();
        for (int i = 0; i < times; i++)
        {
            result.Append(word);
        }

        return result.ToString();
    }
}
